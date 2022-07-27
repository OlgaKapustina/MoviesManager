import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    @Test
    public void shouldFindAll(){
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");


        String[] expected = { "First", "Second", "Third" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast(){
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");


        String[] expected = { "Third", "Second", "First" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
