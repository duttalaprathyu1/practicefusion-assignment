package com.practicefusion.assignment;

// Doctor class representing doctor object
public class Doctor {
	private String firstName;
	private String lastName;
	private int age;
	private String sex;
	private String speciality;
	private String location;
	private int reviewScore;

	// constructor
	// assuming these below fields for the assignment
	public Doctor(String firstName, String lastName, int age, String sex, String speciality, String area, int reviewScore) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.speciality = speciality;
		this.age = age;
		this.reviewScore = reviewScore;
		this.location = area;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSpecality() {
		return speciality;
	}

	public void setSpecality(String specality) {
		this.speciality = specality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String area) {
		this.location = area;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setScore(int score) {
		this.reviewScore = score;
	}

	// prints the doctor info
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.age + " "
				+ this.sex + " " + this.speciality + " " + this.location + " "
				+ this.reviewScore;
	}

}
