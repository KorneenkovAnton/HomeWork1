package com.epam.firstlevel;


import java.util.Collection;
import java.util.Date;
import com.epam.enums.Format;


public abstract class Multimedia {

    private long size;
    private Collection<Format> format;
    private String name;
    private Date dateOfCreation;

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Collection<Format> getFormat() {
        return format;
    }

    public void setFormat(Collection<Format> format) {
        this.format = format;
    }

    public String getNameOfFile() {
        return name;
    }

    public void setNameOfFile(String nameOfFile) {
        this.name = nameOfFile;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
