package com.epam.supportingclasses;


import java.util.Date;

public class AutorOfBook extends Human {

    private String pseudonim;

    public String getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    public AutorOfBook(String name, String sname, Date dateOfBirthday, String pseudonim) {
        super(name, sname, dateOfBirthday);
        this.pseudonim = pseudonim;
    }

    public AutorOfBook(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    public AutorOfBook() {
        super();
    }
}
