package com.company_ggc;

public class Skin extends Organ {
    private String color;
    private int softness; // 0 - 100

    public Skin(String name, String condition, String color, int softness) {
        super(name, condition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Skin color: " + this.getColor());
    }

    public String getColor() {
        return color;
    }

}
