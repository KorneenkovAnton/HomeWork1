package com.epam.secondlvl;

import com.epam.firstlevel.Video;

public class Film extends Video {

    private boolean is3D;
    private long totalFees;
    private  boolean isShirtFilm;

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public long getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(long totalFees) {
        this.totalFees = totalFees;
    }

    public boolean isShirtFilm() {
        return isShirtFilm;
    }

    public void setShirtFilm(boolean shirtFilm) {
        isShirtFilm = shirtFilm;
    }
}
