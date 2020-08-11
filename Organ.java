package com.company_ggc;

import java.util.Scanner;

public class Organ {
    private String name;
    private String condition;

    public Organ(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public void getDetail() {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical condition: " + this.getCondition());
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }


}
