package com.example.stay_slip_management_system.quarter2;

import org.junit.Test;
public class AbellarTest {
    @Test
    public void printMyProfile() {
        String myName = "Andreana";
        String petName = "Millow";
        String favFood = "Adobo";
        int myAge = 17;

        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day!");
    }
}