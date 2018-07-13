package com.epam.supportingclasses;


import java.util.Date;

public class Singer extends Human  {


    private int countOfGrams;
    private Label label;

    public int getCountOfGrams() {
        return countOfGrams;
    }

    public void setCountOfGrams(int countOfGrams) {
        this.countOfGrams = countOfGrams;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Singer(String name, String sname, Date dateOfBirthday, int countOfGrams) {
        super(name, sname, dateOfBirthday);
        this.countOfGrams = countOfGrams;
    }

    public Singer(int countOfGrams) {
        this.countOfGrams = countOfGrams;
    }

    public Singer() {
        super();
    }
}
