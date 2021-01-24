package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book(
                "Brunon Stamp",
                "Kill All",
                2000,
                "XAZ"));
        bookA.add(new Book(
                "Aisha Winto",
                "Slow down",
                2001,
                "XAZ"));
        bookA.add(new Book(
                "Eryka Fox",
                "What?",
                1976,
                "XGZ"));
        bookA.add(new Book(
                "Elizabeth John",
                "Alberta",
                2000,
                "SAX"));
        bookA.add(new Book(
                "Monta Dix",
                "Last Trump",
                1937,
                "AWF"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        Assert.assertEquals(2000, median);
    }
}