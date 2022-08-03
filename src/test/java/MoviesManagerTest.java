import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    MoviesManager manager = new MoviesManager();

    @Test
    public void shouldFindAll() {
        manager.add("First");
        manager.add("Second");
        manager.add("Third");


        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        manager.add("First");
        manager.add("Second");
        manager.add("Third");


        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLimitLessRange(){
        MoviesManager manager = new MoviesManager(4);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        String[] expected = {"Fifth", "Forth", "Third", "Second"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastWithLimit(){
        MoviesManager manager = new MoviesManager(5);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        String[] expected = {"Fifth", "Forth", "Third", "Second", "First"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithMoreThanLimit(){
        MoviesManager manager = new MoviesManager(8);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Forth");
        manager.add("Fifth");
        String[] expected = {"Fifth", "Forth", "Third", "Second", "First"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}
