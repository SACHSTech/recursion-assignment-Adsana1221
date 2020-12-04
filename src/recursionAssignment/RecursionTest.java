package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Before;
//import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    
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
     assertEquals(1, Recursion.count7());
        // assertTrue(TESTBOOLEAN);
    }
    
}
