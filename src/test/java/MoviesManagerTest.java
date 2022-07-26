import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    @Test
    public void test1(){
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");


        String[] expected = { "First", "Second", "Third" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");


        String[] expected = { "First", "Second", "Third" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
