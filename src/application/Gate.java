package application;

//@author : Anshuman Suri : 2014021
//Please read the README.md before testing the applciation 

import java.io.Serializable;

@SuppressWarnings("serial")
class Gate extends CheckEmpty implements Serializable
{
	String area;
	int year,rank;
	float marks,score;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
}