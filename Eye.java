package com.company_ggc;

import java.util.Scanner;



public class Eye extends Organ {
    private String color;
    private boolean isOpened;

    public Eye(String name, String condition, String color, boolean isOpened) {
        super(name, condition);
        this.color = color;
        this.isOpened = isOpened;
    }
    // override getDetails Method for change the method


    @Override
    public void getDetail() {
        super.getDetail(); // This line shows the general details of the class organ
        System.out.println("Color: " + this.getColor());
    }

    // another method
    public void open() {
        // change variable to open
        this.setOpened(true);
        System.out.println(this.getName() + " Opened"); //getName is from parent class
    }
    public void close() {
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }

    public String getColor() {
        return color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}

