package com.valtech.assignment.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.valtech.assignments.Catchy;


 
import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
 

 
public class catchyTest {
	
	
		Catchy cnf;
			@Test
			void testfindMostCatchyNumber() {
				assertEquals("12121212",cnf.findMostCatchyNumber(List.of("11112222", "12121212", "999999999", "98765432")) );
			}
		 
	
 
//    @Test
//    public void testfindMostCatchyNumber() {
//        String[] numbers = {"7777770777", "123454321", "8888888","7777177771","45245677"};
//        String Catchy = Catchy.findMostCatchyNumber(numbers);
//        assertEquals("7777177771", Catchy);
//    }
// 
//    @Test
//    public void testFindCatchyNumberWithEmptyInput() {
//        String[] numbers = {};
//        String catchyNumber = CatchyNumber.findCatchyNumber(numbers);
//        assertNull(catchyNumber);
//    }
 

}