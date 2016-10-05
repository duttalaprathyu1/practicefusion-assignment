package com.practicefusion.assignment;

import java.util.Comparator;

public class DoctorComparator implements Comparator<Doctor> {
	private String firstName;
	private String lastName;
	private int age;
	private String sex;
	private String speciality;
	private String location;
	private int reviewScore;

	public DoctorComparator(String firstName, String lastName, int age, String sex, String speciality, String area,
			int reviewScore) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		this.speciality = speciality;
		this.location = area;
		this.reviewScore = reviewScore;
	}

	@Override
	/* 
	 Sort by ascending order of the score value, with most similar object's score will be closest 
	 to 0, the higher the score the more dissimilar the object is. 
	 Most similar objects come at the top of the list, the least matching objects at the bottom
	 */
	public int compare(Doctor doctor1, Doctor doctor2) {
		return Integer.compare(getSimilarityScore(doctor1), getSimilarityScore(doctor2));
	}
	
	/* 
	 For the sake of simplifying the code, I have chosen 4 fields to compute similarity score
	 sex, specialty, age, and review score. Ideally all fields should be used to get similarity score

	 NOTE: Not all fields of the doctor are equal. For simplicity and time concerns I have not assigned weights 
	 for certain fields such as "Specialty" & "ReviewScore". 
	 But we can do so to sort the list with most relevant and better doctors more accurately
	 */
	public int getSimilarityScore(Doctor doctorInfo) {
		int sexCmp = Math.abs(this.sex.compareTo(doctorInfo.getSex()));
		int specialityComp = Math.abs(this.speciality.compareTo(doctorInfo.getSpecality()));
		int ageComp = Math.abs(Integer.compare(this.age, doctorInfo.getAge()));
		int reviewScoreComp = Math.abs(Integer.compare(this.reviewScore, doctorInfo.getReviewScore())); 
		
		// I'm using simple method of addition to compute the score
		// Obviously in reality it will not be so simple :)
		// get final score for similarity by computing sum of all individual scores
		int similarityScore = (sexCmp + specialityComp + ageComp + reviewScoreComp );
		return similarityScore;
	}
}
