package com.epam.thirdlvl;


import com.epam.enums.GenreOfBook;
import com.epam.secondlvl.Audio;
import com.epam.supportingclasses.AutorOfBook;

import java.util.Collection;
import java.util.Date;

public class EBook extends Audio {

    private AutorOfBook autorOfBook;
    private Collection<GenreOfBook> genresOfBook;
    private Date dateOfWritting;
    private int countOfChapters;

    public AutorOfBook getAutorsOfBook() {
        return autorOfBook;
    }

    public void setAutorsOfBook(AutorOfBook autorOfBook) {
        this.autorOfBook = autorOfBook;
    }

    public Collection<GenreOfBook> getGenresOfBook() {
        return genresOfBook;
    }

    public void setGenresOfBook(Collection<GenreOfBook> genresOfBook) {
        this.genresOfBook = genresOfBook;
    }

    public Date getDateOfWritting() {
        return dateOfWritting;
    }

    public void setDateOfWritting(Date dateOfWritting) {
        this.dateOfWritting = dateOfWritting;
    }

    public int getCountOfChapters() {
        return countOfChapters;
    }

    public void setCountOfChapters(int countOfChapters) {
        this.countOfChapters = countOfChapters;
    }

    public EBook(AutorOfBook autorOfBook, Collection<GenreOfBook> genresOfBook, Date dateOfWritting, int countOfChapters) {
        this.autorOfBook = autorOfBook;
        this.genresOfBook = genresOfBook;
        this.dateOfWritting = dateOfWritting;
        this.countOfChapters = countOfChapters;
    }

    public EBook() {
    }
}
