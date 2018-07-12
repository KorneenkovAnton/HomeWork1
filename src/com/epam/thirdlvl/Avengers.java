package com.epam.thirdlvl;


import com.epam.secondlvl.Film;

import java.util.Collection;

public class Avengers extends Film{

    private String nameOfVillian;
    private Collection<String> nameOfAvengers;

    public String getNameOfVillian() {
        return nameOfVillian;
    }

    public void setNameOfVillian(String nameOfVillian) {
        this.nameOfVillian = nameOfVillian;
    }

    public Collection<String> getNameOfAvengers() {
        return nameOfAvengers;
    }

    public void setNameOfAvengers(Collection<String> nameOfAvengers) {
        this.nameOfAvengers = nameOfAvengers;
    }
}
