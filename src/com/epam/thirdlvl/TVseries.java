package com.epam.thirdlvl;


import com.epam.secondlvl.Video;
import com.epam.supportingclasses.Actor;

import java.util.Collection;


public class TVseries extends Video {

    private int countOfEpisodes;
    private  int countOfSeasons;

    public int getCountOfEpisodes() {
        return countOfEpisodes;
    }

    public void setCountOfEpisodes(int countOfEpisodes) {
        this.countOfEpisodes = countOfEpisodes;
    }

    public int getCountOfSeasons() {
        return countOfSeasons;
    }

    public void setCountOfSeasons(int countOfSeasons) {
        this.countOfSeasons = countOfSeasons;
    }

    public TVseries(int budget, String studioName, Collection<Actor> actors, double rating, int frameFrequency,
                    int width, int height, int countOfEpisodes, int countOfSeasons) {
        super(budget, studioName, actors, rating, frameFrequency, width, height);
        this.countOfEpisodes = countOfEpisodes;
        this.countOfSeasons = countOfSeasons;
    }

    public TVseries(int countOfEpisodes, int countOfSeasons) {
        this.countOfEpisodes = countOfEpisodes;
        this.countOfSeasons = countOfSeasons;
    }

    public TVseries() {
    }
}
