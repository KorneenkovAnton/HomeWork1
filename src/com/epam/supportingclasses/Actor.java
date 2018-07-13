package com.epam.supportingclasses;

import java.util.Date;

public class Actor extends Human {

    private int fee;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public Actor(String name, String sname, Date dateOfBirthday, int fee) {
        super(name, sname, dateOfBirthday);
        this.fee = fee;
    }

    public Actor(int fee) {
        this.fee = fee;
    }

    public Actor() {
        super();
    }
}
