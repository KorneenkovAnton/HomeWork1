package com.epam.secondlvl;

import com.epam.firstlevel.Multimedia;


public class Audio extends Multimedia {

    private int duration;
    private int frequencyRangeMin;
    private int frequencyRangeMax;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFrequencyRangeMin() {
        return frequencyRangeMin;
    }

    public void setFrequencyRangeMin(int frequencyRangeMin) {
        this.frequencyRangeMin = frequencyRangeMin;
    }

    public int getFrequencyRangeMax() {
        return frequencyRangeMax;
    }

    public void setFrequencyRangeMax(int frequencyRangeMax) {
        this.frequencyRangeMax = frequencyRangeMax;
    }

    public Audio(int duration, int frequencyRangeMin, int frequencyRangeMax) {
        this.duration = duration;
        this.frequencyRangeMin = frequencyRangeMin;
        this.frequencyRangeMax = frequencyRangeMax;
    }

    public Audio() {
    }
}
