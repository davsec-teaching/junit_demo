package com.ecs160.unittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*; 


import com.ecs160.unittesting.App;
/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeEach
    public void init() {
        System.out.println("Run this before every test...");
    }

    @BeforeAll
    static public void init2() {
        System.out.println("Run this before every class ...");
    }

    @Test
    public void testApp()
    {
        App app = new App();
        app.setName("XYZ");
        app.setAge(22);
        int birthYear = app.computeYearBorn();
        assertEquals(birthYear, 2003);
    }

    @Test
    public void testApp2()
    {
        App app = new App();
        app.setName("XYZ");
        app.setAge(27);
        int birthYear = app.computeYearBorn();
        assertEquals(birthYear, 1998);
    }
}
