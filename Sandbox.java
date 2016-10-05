package com.practicefusion.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sandbox {
	public static void main(String args[]) {
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
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
		Iterator<Doctor> iter1 = doctors.iterator();
		System.out.println("-----GIVEN LIST-----");
		while (iter1.hasNext()) {
			System.out.println(iter1.next().toString());
		}
		
		
		// sorts the list in order in which most similar doctors will
		// be at the top
		// example 1
		System.out.println("\n\n-----EXAMPLE 1-----");
		Collections.sort(doctors, new DoctorComparator("Taylor", "Swift", 52, "Female", "Family Medicine", "Dallas", 5));
		Iterator<Doctor> iter2 = doctors.iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next().toString());
		}
		// example 2
		Collections.sort(doctors, new DoctorComparator("Tom", "Hanks", 100, "Male", "Opthalmology", "India", 1));
		System.out.println("\n\n-----EXAMPLE 2-----");
		iter2 = doctors.iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next().toString());
		}

	}

}
