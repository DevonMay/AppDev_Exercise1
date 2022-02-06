package za.ac.cput.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    public Human human1,human2,human3;

    @BeforeEach
    void setUp() {
        human1=new Human("Joe",21);
        human2 = new Human("John", 24);
        human3=human1;
    }

    @Test
    public void equalityPassTest()
    {
        assertEquals(human1, human3);
    }

    @Test
    public void identityTest(){
        assertSame(human1, human3);
    }

    @Test
    public void equalityFailTest()
    {
        assertEquals(human1, human2);
    }

    @Test
    public void equalityPassTest1()
    {
        assertNotEquals(human1, human2);
    }

    @Test
    @Timeout(1) //test should time out after 1 second
    void testTimeout()
    {
        try
        {
            TimeUnit.SECONDS.sleep(2); //line will run for 2 seconds before being put to sleep
            System.out.println("Timeout test PASSED");
        }
        catch(InterruptedException iEx)
        {
            System.out.println("Exception: "+iEx.getMessage());
            System.out.println("Test timed out");
        }
    }

    @Test
    @Disabled("Test disabled for testing purposes")
    public void testDisable(){
        assertEquals(human1, human2);
    }

}