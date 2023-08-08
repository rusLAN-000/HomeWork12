package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void addMovie() {

        manager.addNewMovie("Bloodshot");
        manager.addNewMovie("Forward");
        manager.addNewMovie("Gentlemen");
        manager.addNewMovie("Invisible Man");
        manager.addNewMovie("Trolls");
        manager.addNewMovie("Number one");

        String[] expected = {"Bloodshot", "Forward", "Gentlemen", "Invisible Man", "Trolls", "Number one"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void latestMovies() {

        manager.addNewMovie("Bloodshot");
        manager.addNewMovie("Forward");
        manager.addNewMovie("Gentlemen");
        manager.addNewMovie("Invisible Man");
        manager.addNewMovie("Trolls");
        manager.addNewMovie("Number one");

        String[] expected = {"Number one", "Trolls", "Invisible Man", "Gentlemen", "Forward"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
