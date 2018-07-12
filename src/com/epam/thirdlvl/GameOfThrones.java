package com.epam.thirdlvl;


import com.epam.secondlvl.TVseries;

import java.util.Collection;

public class GameOfThrones extends TVseries {

    private Collection<String> nameOfGrateHouses;
    private int countOfWolfs;

    public Collection<String> getNameOfGrateHouses() {
        return nameOfGrateHouses;
    }

    public void setNameOfGrateHouses(Collection<String> nameOfGrateHouses) {
        this.nameOfGrateHouses = nameOfGrateHouses;
    }

    public int getCountOfWolfs() {
        return countOfWolfs;
    }

    public void setCountOfWolfs(int countOfWolfs) {
        this.countOfWolfs = countOfWolfs;
    }
}
