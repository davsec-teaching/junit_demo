package com.ecs160.unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 


import com.ecs160.unittesting.App;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testApp()
    {
        App app = new App();
        app.setName("XYZ");
        app.setAge(22);
        int birthYear = app.computeYearBorn();
        assertEquals(birthYear, 2003);
    }
}
