package com.epam.thirdlvl;

import com.epam.enums.GenreOfMusic;
import com.epam.secondlvl.Audio;
import com.epam.supportingclasses.Compositor;
import com.epam.supportingclasses.Singer;

import java.util.Collection;


public class Music extends Audio {

    private Collection<Singer> singers;
    private Collection<GenreOfMusic> genres;
    private  Collection<Compositor> compositors;
    private String nameOfAlbum;

    public Collection<Singer> getSingers() {
        return singers;
    }

    public void setSingers(Collection<Singer> singers) {
        this.singers = singers;
    }

    public Collection<GenreOfMusic> getGenres() {
        return genres;
    }

    public void setGenres(Collection<GenreOfMusic> genres) {
        this.genres = genres;
    }

    public Collection<Compositor> getCompositors() {
        return compositors;
    }

    public void setCompositors(Collection<Compositor> compositors) {
        this.compositors = compositors;
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public void setNameOfAlbum(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public Music(Collection<Singer> singers, Collection<GenreOfMusic> genres, Collection<Compositor> compositors,
                 String nameOfAlbum) {
        this.singers = singers;
        this.genres = genres;
        this.compositors = compositors;
        this.nameOfAlbum = nameOfAlbum;
    }

    public Music() {
    }
}
