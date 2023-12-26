package com.teams.Factory;

import com.teams.DaoJson.Team;
import com.teams.Dto.StudentDto;
import com.teams.Model.Student;

public class StudentFactory {
    public static Student createStudent(String name, Team team, boolean isPresent){
       switch (team){
           case DOTNET -> {
               return new DotNetTeamStudent(new StudentDto(name,team,isPresent));
           }
           case JAVA -> {
               return new JavaTeamStudent(new StudentDto(name,team,isPresent));
           }
           default -> {
               return null;
           }
       }
   }
}
