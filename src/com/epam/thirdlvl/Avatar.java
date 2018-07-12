package com.epam.thirdlvl;


import com.epam.secondlvl.Film;

public class Avatar extends Film {

    private long priceOfAnaptanium;
    private String nameOfPlanet;

    public long getPriceOfAnaptanium() {
        return priceOfAnaptanium;
    }

    public void setPriceOfAnaptanium(long priceOfAnaptanium) {
        this.priceOfAnaptanium = priceOfAnaptanium;
    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public void setNameOfPlanet(String nameOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
    }
}
