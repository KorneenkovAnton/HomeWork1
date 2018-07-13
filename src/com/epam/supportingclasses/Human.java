package com.epam.supportingclasses;

import java.util.Date;


public class Human {

    private String name;
    private String sname;
    private Date dateOfBirthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public Human(String name, String sname, Date dateOfBirthday) {
        this.name = name;
        this.sname = sname;
        this.dateOfBirthday = dateOfBirthday;
    }

    public Human() {
    }
}
