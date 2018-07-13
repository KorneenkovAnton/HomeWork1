package com.epam.thirdlvl;


import com.epam.secondlvl.Video;
import com.epam.supportingclasses.Actor;

import java.util.Collection;

public class Film extends Video {

    private int boxOffice;

    public int getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(int boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Film(int budget, String studioName, Collection<Actor> actors, double rating,
                int frameFrequency, int width, int height, int boxOffice) {
        super(budget, studioName, actors, rating, frameFrequency, width, height);
        this.boxOffice = boxOffice;
    }

    public Film(int boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Film() {
    }
}
