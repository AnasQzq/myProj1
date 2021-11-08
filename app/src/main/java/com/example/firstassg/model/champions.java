package com.example.firstassg.model;

import java.util.ArrayList;

public class champions {
    private String name;
    private ArrayList<String>  info;

    public champions(String name, ArrayList<String> info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(ArrayList<String> info) {
        this.info = info;
    }

    public ArrayList<String> getInfo() {
        return info;
    }
}
