package com.epam.secondlvl;


import com.epam.firstlevel.Multimedia;
import com.epam.supportingclasses.Actor;

import java.util.Collection;

public abstract class Video extends Multimedia{

    private int budget;
    private String studioName;
    private Collection<Actor> actors;
    private double rating;
    private int frameFrequency;
    private int width;
    private int height;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public Collection<Actor> getActors() {
        return actors;
    }

    public void setActors(Collection<Actor> actors) {
        this.actors = actors;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getFrameFrequency() {
        return frameFrequency;
    }

    public void setFrameFrequency(int frameFrequency) {
        this.frameFrequency = frameFrequency;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Video(int budget, String studioName, Collection<Actor> actors, double rating, int frameFrequency, int width, int height) {
        this.budget = budget;
        this.studioName = studioName;
        this.actors = actors;
        this.rating = rating;
        this.frameFrequency = frameFrequency;
        this.width = width;
        this.height = height;
    }

    public Video() {
    }
}
