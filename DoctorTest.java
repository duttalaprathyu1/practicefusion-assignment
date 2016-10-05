package com.practicefusion.assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoctorTest {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	
	@Before
	public void setUp() throws Exception {
		doctors.add(new Doctor("Taylor", "Swift", 32, "Female", "Family Medicine",
				"Dallas", 5));
		doctors.add(new Doctor("Indira", "Reddy", 24, "Female", "Family Medicine",
				"Arizona", 5));
		doctors.add(new Doctor("Matt", "Damon", 35, "Male", "Pedeatrics",
				"San Jose", 4));
		doctors.add(new Doctor("Harrison", "Ford", 30, "Male", "Familiy Medicine",
				"North Caroline", 2));
		doctors.add(new Doctor("Jennifer", "Aniston", 33, "Female", "Gynacalogy",
				"New York", 3));
	}

	@After
	public void tearDown() throws Exception {
		doctors.clear();
	}

	/*
	 similar doctors will be at the top of the list
	 the similarity of the doctors reduce as you traverse through the list
	 this test also shows the exact match scenario (Taylor Swift is at the top)
	 */
	@Test
	public void testSimilarity() {
		ArrayList<String> expecedList = new ArrayList<>(Arrays.asList("Taylor Swift", "Indira Reddy", "Jennifer Aniston", "Matt Damon", "Harrison Ford")); 
		Collections.sort(doctors, new DoctorComparator("Taylor", "Swift", 32, "Female", "Family Medicine", "Dallas", 5));
		ArrayList<String> actualList = new ArrayList<String>();
		Iterator<Doctor> iter2 = doctors.iterator();
		while (iter2.hasNext()) {
			Doctor doc = iter2.next();
			actualList.add(doc.getFirstName() + " " + doc.getLastName());
		}
		assertEquals(expecedList, actualList);
	}

	// least match case
	@Test
	public void testLeastMatchCase(){
		String expected = "Matt Damon";
		Collections.sort(doctors, new DoctorComparator("Tom", "Hanks", 100, "Male", "Opthalmology", "India", 1));
		assertEquals(expected, doctors.get(0).getFirstName() +" " +  doctors.get(0).getLastName() );
	}
}
