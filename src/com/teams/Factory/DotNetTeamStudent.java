package com.teams.Factory;

import com.teams.DaoJson.Team;
import com.teams.Dto.StudentDto;
import com.teams.Model.Student;

public class DotNetTeamStudent extends Student {
    public DotNetTeamStudent(StudentDto student) {
        super(student.getName(), student.getTeam(), student.isPresent());
    }
}
