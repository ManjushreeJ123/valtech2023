package com.valtech.assignment.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.valtech.assignments.Catchy;


 
import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
 
@DisplayName("To test  catchynumber")
 
public class catchyTest {
 
    @Test
    public void testFindCatchyNumberWithValidInput() {
        String[] numbers = {"7777770777", "123454321", "8888888","7777177771","45245677"};
        String Catchy = Catchy.findMostCatchyNumber(numbers);
        assertEquals("7777177771", Catchy);
    }
 
//    @Test
//    public void testFindCatchyNumberWithEmptyInput() {
//        String[] numbers = {};
//        String catchyNumber = CatchyNumber.findCatchyNumber(numbers);
//        assertNull(catchyNumber);
//    }
 

}