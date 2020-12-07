package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Before;
//import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    // problem 1
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
     assertEquals(0, Recursion.count7(4));
        // assertTrue(TESTBOOLEAN);
    }
    
    // add more tests
    
    @Test
    public void Test2(){
        // make assertion statement(s)
     assertEquals(1, Recursion.count7(17));
        // assertTrue(TESTBOOLEAN);
    }
    
     @Test
    public void Test3(){
        // make assertion statement(s)
     assertEquals(2, Recursion.count7(773));
        // assertTrue(TESTBOOLEAN);
    }
    
    
    // problem 2 
    /**
     * An initial test
     */
    @Test
    public void Test4(){
        // make assertion statement(s)
     assertEquals("", Recursion.changePi(""));
        // assertTrue(TESTBOOLEAN);
    }

    
    @Test
    public void Test5(){
        // make assertion statement(s)
     assertEquals("3.143.14", Recursion.changePi("pipi"));
        // assertTrue(TESTBOOLEAN);
    }


    // problem 3 
    /**
     * An initial test
     */
    @Test
    public void Test6(){
        // make assertion statement(s)
     assertEquals("", Recursion.stringClean(""));
        // assertTrue(TESTBOOLEAN);
    }
 
    @Test
    public void Test7(){
        // make assertion statement(s)
     assertEquals("abc", Recursion.stringClean("abc"));
        // assertTrue(TESTBOOLEAN);
    }
    

    @Test
    public void Test8(){
        // make assertion statement(s)
     assertEquals("helo", Recursion.stringClean("hello"));
        // assertTrue(TESTBOOLEAN);
    }
}
