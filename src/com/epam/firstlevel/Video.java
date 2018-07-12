package com.epam.firstlevel;

import com.epam.enums.*;

import java.util.Collection;

public abstract class Video {

    private int yearOfRelease;
    private int commonTiming;
    private int budget;
    private String name;
    private String director;
    private Collection<String> actors;
    private Collection<Genre> genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getCommonTiming() {
        return commonTiming;
    }

    public void setCommonTiming(int commonTiming) {
        this.commonTiming = commonTiming;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Collection<String> getActors() {
        return actors;
    }

    public void setActors(Collection<String> actors) {
        this.actors = actors;
    }

    public Collection<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Collection<Genre> genre) {
        this.genre = genre;
    }
}
