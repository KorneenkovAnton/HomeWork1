package com.epam.secondlvl;


import com.epam.firstlevel.Video;

public class TVseries extends Video {

    private int countOFSeasons;
    private int countOfEpisodes;
    private int endDate;

    public int getCountOFSeasons() {
        return countOFSeasons;
    }

    public void setCountOFSeasons(int countOFSeasons) {
        this.countOFSeasons = countOFSeasons;
    }

    public int getCountOfEpisodes() {
        return countOfEpisodes;
    }

    public void setCountOfEpisodes(int countOfEpisodes) {
        this.countOfEpisodes = countOfEpisodes;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
}
