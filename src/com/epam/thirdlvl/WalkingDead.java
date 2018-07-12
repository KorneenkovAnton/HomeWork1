package com.epam.thirdlvl;

import com.epam.secondlvl.TVseries;


public class WalkingDead extends TVseries {

    private int countOfInfected;
    private int countOfChildrenOfMainCharacter;

    public int getCountOfInfected() {
        return countOfInfected;
    }

    public void setCountOfInfected(int countOfInfected) {
        this.countOfInfected = countOfInfected;
    }

    public int getCountOfChildrenOfMainCharacter() {
        return countOfChildrenOfMainCharacter;
    }

    public void setCountOfChildrenOfMainCharacter(int countOfChildrenOfMainCharacter) {
        this.countOfChildrenOfMainCharacter = countOfChildrenOfMainCharacter;
    }
}
