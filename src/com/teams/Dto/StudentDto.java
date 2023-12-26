package com.teams.Dto;

import com.teams.DaoJson.Team;

public class StudentDto {
    private String name;
    private Team team;
    private boolean isPresent;
    public StudentDto(String name, Team team, boolean isPresent) {
        this.name = name;
        this.team = team;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", isPresent=" + isPresent +
                '}';
    }
}
