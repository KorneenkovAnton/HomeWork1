package com.epam.thirdlvl;


import com.epam.secondlvl.Audio;

public class VoiceMail extends Audio {

    private String nameOfSender;
    private boolean sent;
    private boolean read;

    public String getNameOfSender() {
        return nameOfSender;
    }

    public void setNameOfSender(String nameOfSender) {
        this.nameOfSender = nameOfSender;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public VoiceMail(int duration, int frequencyRangeMin, int frequencyRangeMax, String nameOfSender, boolean sent, boolean read) {
        super(duration, frequencyRangeMin, frequencyRangeMax);
        this.nameOfSender = nameOfSender;
        this.sent = sent;
        this.read = read;
    }

    public VoiceMail(String nameOfSender, boolean sent, boolean read) {
        this.nameOfSender = nameOfSender;
        this.sent = sent;
        this.read = read;
    }

    public VoiceMail() {
    }
}
