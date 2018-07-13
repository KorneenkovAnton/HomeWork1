package com.epam.supportingclasses;


import java.util.Date;

public abstract class Label {

    private String nameOfLabel;
    private Date dateOfCreation;
    private String nameOfOwner;

    public String getNameOfLabel() {
        return nameOfLabel;
    }

    public void setNameOfLabel(String nameOfLabel) {
        this.nameOfLabel = nameOfLabel;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public Label(String nameOfLabel, Date dateOfCreation, String nameOfOwner) {
        this.nameOfLabel = nameOfLabel;
        this.dateOfCreation = dateOfCreation;
        this.nameOfOwner = nameOfOwner;
    }

    public Label() {
    }
}
