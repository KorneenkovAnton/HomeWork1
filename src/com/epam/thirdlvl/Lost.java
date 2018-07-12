package com.epam.thirdlvl;


import com.epam.secondlvl.TVseries;

public class Lost extends TVseries{

    private int countOfSurvivors;
    private int cpecialCode;

    public int getCountOfSurvivors() {
        return countOfSurvivors;
    }

    public void setCountOfSurvivors(int countOfSurvivors) {
        this.countOfSurvivors = countOfSurvivors;
    }

    public int getCpecialCode() {
        return cpecialCode;
    }

    public void setCpecialCode(int cpecialCode) {
        this.cpecialCode = cpecialCode;
    }
}
