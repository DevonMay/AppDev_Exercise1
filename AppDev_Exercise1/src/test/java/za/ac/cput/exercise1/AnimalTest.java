package za.ac.cput.exercise1;
/**
 * Devon May
 * 219168296
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    Animal deer, goose;

    @BeforeEach
    public void setUp(){
        deer = new Animal();
        goose = new  Animal();
        deer=goose;
    }

    @Test
    public void testEquality(){

        Assertions.assertEquals(deer, goose);
    }


    @Test
    public void testIdentity() {
        assertSame(goose, goose);
    }

    @Test
    public void testFail()
    {
        assertSame(goose, goose);
        fail("this test was deliberately made to fail by student 219168296");
    }

    @Test
    void timeoutExceeded() {
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    @Test
    @Disabled("Test was disabled by student 219168296.")
    public  void testDisable()
    {
        System.out.println("If i appear in output, that means i was not disabled successfully");
    }

}
