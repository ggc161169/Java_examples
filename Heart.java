package com.company_ggc;

public class Heart extends Organ {
    private int rate;

    public Heart(String name, String condition, int rate) {
        super(name, condition);
        this.rate = rate;
    }

    @Override
    public void getDetail() {
        super.getDetail();

        System.out.println("Heart rate: " + this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
