package application;

//@author : Anshuman Suri : 2014021
//Please read the README.md before testing the applciation 

import java.io.Serializable;

@SuppressWarnings("serial")
class Education implements Serializable
{
	int x_year,xii_year,graduation_year;
	boolean ece_phd,post_graduate,other_degree,given_gate;
	float x_marks,xii_marks,graduation_marks;
	String x_board,xii_board;
	String degree,department,college,university,city,state;
	String achievements;
	Other_Degree OD;
	ECE E;
	boolean drop;
	int type;
	public boolean isDrop() {
		return drop;
	}
	public void setDrop(boolean drop) {
		this.drop = drop;
	}
	public int isType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public ECE getE() {
		return E;
	}
	public void setE(ECE e) {
		E = e;
	}
	Gate G;
	Post_Graduate PG;
	public int getX_year() {
		return x_year;
	}
	public void setX_year(int x_year) {
		this.x_year = x_year;
	}
	public int getXii_year() {
		return xii_year;
	}
	public void setXii_year(int xii_year) {
		this.xii_year = xii_year;
	}
	public int getGraduation_year() {
		return graduation_year;
	}
	public void setGraduation_year(int graduation_year) {
		this.graduation_year = graduation_year;
	}
	public boolean getEce_phd() {
		return ece_phd;
	}
	public void setEce_phd(boolean ece_phd) {
		this.ece_phd = ece_phd;
	}
	public boolean getPost_graduate() {
		return post_graduate;
	}
	public void setPost_graduate(boolean post_graduate) {
		this.post_graduate = post_graduate;
	}
	public boolean getOther_degree() {
		return other_degree;
	}
	public void setOther_degree(boolean other_degree) {
		this.other_degree = other_degree;
	}
	public boolean getGiven_gate() {
		return given_gate;
	}
	public void setGiven_gate(boolean given_gate) {
		this.given_gate = given_gate;
	}
	public float getX_marks() {
		return x_marks;
	}
	public void setX_marks(float x_marks) {
		this.x_marks = x_marks;
	}
	public float getXii_marks() {
		return xii_marks;
	}
	public void setXii_marks(float xii_marks) {
		this.xii_marks = xii_marks;
	}
	public float getGraduation_marks() {
		return graduation_marks;
	}
	public void setGraduation_marks(float graduation_marks) {
		this.graduation_marks = graduation_marks;
	}
	public String getX_board() {
		return x_board;
	}
	public void setX_board(String x_board) {
		this.x_board = x_board;
	}
	public String getXii_board() {
		return xii_board;
	}
	public void setXii_board(String xii_board) {
		this.xii_board = xii_board;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public Other_Degree getOD() {
		return OD;
	}
	public void setOD(Other_Degree oD) {
		OD = oD;
	}
	public Gate getG() {
		return G;
	}
	public void setG(Gate g) {
		G = g;
	}
	public Post_Graduate getPG() {
		return PG;
	}
	public void setPG(Post_Graduate pG) {
		PG = pG;
	}
}