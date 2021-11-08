package com.example.firstassg.model;

public class Expectations {
    private  String team;
    private  String year;


    public Expectations(String team, String year) {
        this.team = team;
        this.year = year;
    }

    public String getTeam() {
        return team;
    }

    public String getYear() {
        return year;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
