package com.techelevator;

public class HomeworkAssignment {

	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	
	
	
	
	
	//constructor
	
	public HomeworkAssignment (int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
	}
	
	//method
	
	public String getLetterGrade () {
		
		
		//letterGrade(derived i will use get)) = earnedMarks / possibleMarks;
		
		if (((1.0 * earnedMarks / possibleMarks) * 100) >= 90) {
			
			return "A";
			
		}
		else if((((double)earnedMarks/ possibleMarks) * 100) >= 80) {
			return "B";
		}
		else if(((1.0 * earnedMarks/ possibleMarks) * 100) >= 70) {
			return "C";
		}
		else if (((1.0 * earnedMarks / possibleMarks) * 100) >= 60) {
			return "D";
		} else {
			return "F";
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	//getters and setters
	

	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	
	
	
	
	
}
