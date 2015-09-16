package application;

//@author : Anshuman Suri : 2014021
//Please read the README.md before testing the applciation 

import java.io.Serializable;

@SuppressWarnings("serial")
class Other_Degree extends CheckEmpty implements Serializable
{
	String exam_name,subject;
	int year,score,rank;
	public String getExam_name() {
		return exam_name;
	}
	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}