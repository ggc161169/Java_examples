package com.company_ggc;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String condition, boolean isEmpty) {
        super(name, condition);
        this.isEmpty = isEmpty;
    }

    public void digest(){
        System.out.println("Digesting begin... ");
        isEmpty = false;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        if (this.isEmpty()) {
            System.out.println("Need to be fed");
        } else {
            System.out.println("Stomach is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

}
