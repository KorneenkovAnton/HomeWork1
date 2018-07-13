package com.epam.supportingclasses;


import java.util.Date;

public class Compositor extends Human {


    private Label label;

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Compositor(String name, String sname, Date dateOfBirthday, Label label) {
        super(name, sname, dateOfBirthday);
        this.label = label;
    }

    public Compositor(Label label) {
        this.label = label;
    }

    public Compositor() {
        super();
    }
}
