package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    //MovieManager manager = new MovieManager();

    @Test
    public void addMovie() {
        MovieManager manager = new MovieManager();

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
        MovieManager manager = new MovieManager();

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

    @Test
    public void minMovies() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Bloodshot");
        manager.addNewMovie("Forward");
        manager.addNewMovie("Gentlemen");

        String[] expected = {"Gentlemen", "Forward", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxLimitMovies() {
        MovieManager manager = new MovieManager(7);

        manager.addNewMovie("Bloodshot");
        manager.addNewMovie("Forward");
        manager.addNewMovie("Gentlemen");
        manager.addNewMovie("Invisible Man");
        manager.addNewMovie("Trolls");
        manager.addNewMovie("Number one");
        manager.addNewMovie("Trap");

        String[] expected = {"Bloodshot", "Forward", "Gentlemen", "Invisible Man", "Trolls", "Number one", "Trap"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addLimitMovie() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Bloodshot");
        manager.addNewMovie("Forward");
        manager.addNewMovie("Gentlemen");
        manager.addNewMovie("Invisible Man");
        manager.addNewMovie("Trolls");
        //manager.addNewMovie("Number one");

        String[] expected = {"Bloodshot", "Forward", "Gentlemen", "Invisible Man", "Trolls"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
