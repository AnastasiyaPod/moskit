package ru.netology.mockit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MovieManagerTest {
    @Test
    public void noMovieTest() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addMoviesTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        String[] expected = {"Бладшот", "Вперед", "Джентльмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void maxAddMoviesTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        String[] expected = {"Бладшот", "Вперед", "Джентльмены", "Человек-неведимка", "Тролли"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void moreMaxAddMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        String[] expected = {"Бладшот", "Вперед", "Джентльмены", "Человек-неведимка", "Тролли", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        String[] expected = {"Джентльмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void maxFindLastMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        String[] expected = {"Тролли", "Человек-неведимка", "Джентльмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void MoreFindLastMovieTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Отель");
        String[] expected = {"Отель", "Номер один", "Тролли", "Человек-неведимка", "Джентльмены"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}