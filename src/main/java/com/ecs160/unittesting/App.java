package com.ecs160.unittesting;

/**
 * Hello world!
 *
 */
public class App 
{
    private String name;
    private int age;

    // getters and setters

    public void setName(String s) {
        this.name = s;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() { 
        return age;
    }

    public String getName() {
        return name;
    }

    public int computeYearBorn() {
        return 2025 - this.age;
    }
    
}
