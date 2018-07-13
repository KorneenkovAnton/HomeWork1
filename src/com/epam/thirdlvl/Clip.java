package com.epam.thirdlvl;

import com.epam.secondlvl.Video;
import com.epam.supportingclasses.Actor;

import java.util.Collection;


public class Clip extends Video {

    private int countOfView;

    public int getCountOfView() {
        return countOfView;
    }

    public void setCountOfView(int countOfView) {
        this.countOfView = countOfView;
    }

    public Clip(int budget, String studioName, Collection<Actor> actors, double rating,
                int frameFrequency, int width, int height, int countOfView) {
        super(budget, studioName, actors, rating, frameFrequency, width, height);
        this.countOfView = countOfView;
    }

    public Clip(int countOfView) {
        this.countOfView = countOfView;
    }

    public Clip() {
        super();
    }
}
