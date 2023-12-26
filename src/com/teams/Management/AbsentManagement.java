package com.teams.Management;

import com.teams.DaoJson.AbsentFile;
import com.teams.DaoJson.Team;
import com.teams.DaoJson.pathNames;
import com.teams.Model.Student;
import com.teams.Tools.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AbsentManagement {
    FileUtils fus = new FileUtils();
    public static void markAbsent()throws IOException {
        List<Student> listJAVAp = new ArrayList<>() ;
        List<Student> listDOTNETp = new ArrayList<>() ;
        List<Student> listJAVAa = new ArrayList<>() ;
        List<Student> listDOTNETa = new ArrayList<>() ;
        AbsentFile absentfile = AbsentFile.getInstance();
        List<Student> students = FileUtils.readJsonFile(absentfile.getFileContent());
        for (Student s : students){
            if (s.getTeam()==Team.JAVA){
                if (s.isPresent()){
                    listJAVAp.add(s);
                }else {
                    listJAVAa.add(s);
                }

            }else {
                if (s.isPresent()){
                    listDOTNETp.add(s);
                }else {
                    listDOTNETa.add(s);
                }
            }
        }
        printStudents(listJAVAp , "JAVA present");
        FileUtils.writeJsonToFile(listJAVAp,pathNames.OUTPUT_FILE_PATH_JAVA_PRESENT.getPath());
        printStudents(listDOTNETp , "DOTNET present");
        FileUtils.writeJsonToFile(listDOTNETp,pathNames.OUTPUT_FILE_PATH_DOTNET_PRESENT.getPath());
        printStudents(listJAVAa , "JAVA absent");
        FileUtils.writeJsonToFile(listJAVAa,pathNames.OUTPUT_FILE_PATH_JAVA_ABSENT.getPath());
        printStudents(listDOTNETa , "DOTNET absent");
        FileUtils.writeJsonToFile(listDOTNETa,pathNames.OUTPUT_FILE_PATH_DOTNET_ABSENT.getPath());
    }
    public static void printStudents(List<Student> list , String team){
        System.out.println("**************Team "+team+"************");
        for(Student s : list){
            System.out.println(s.toString());
        }
    }

}
