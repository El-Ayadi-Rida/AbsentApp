package com.teams.Tools;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.teams.DaoJson.Team;
import com.teams.Factory.StudentFactory;
import com.teams.Model.Student;
import org.json.JSONArray;
import org.json.JSONObject;

public class FileUtils {
/**
 * @param
 * @return String
 * @throws IOException
 */
public static  List<Student> readJsonFile(String content) throws IOException {
    List<Student> students = new ArrayList<>();
    try {
        JSONArray jsonArray = new JSONArray(content);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String name = jsonObject.getString("name");
            Team team = Team.valueOf(jsonObject.getString("team"));
            boolean isp = jsonObject.getBoolean("isPresent");
            Student Std = StudentFactory.createStudent(name, team,isp);
            students.add(Std);
        }
    }catch (Exception e) {
        e.printStackTrace();
    }
    return students;
}
public static void writeJsonToFile(List<Student> StudentList, String filePath){
    try (FileWriter file = new FileWriter(filePath)) {
        file.write(createStudentsJsonArray(StudentList).toString(4)); // '4' is the indentation level for pretty print
        file.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public static JSONArray createStudentsJsonArray(List<Student> StudentList){
    JSONArray studentsJsonArray = new JSONArray();
    for(Student s : StudentList){
        studentsJsonArray.put(toJSONObject(s));
    }
    return studentsJsonArray;
}
public static JSONObject toJSONObject(Student student){
    JSONObject studentJsonObj = new JSONObject();
    studentJsonObj.put("name" , student.getName());
    studentJsonObj.put("team" , student.getTeam());
    return  studentJsonObj;
}

}
