package application;

import java.io.Serializable;
import java.sql.Timestamp;

import javafx.scene.control.DatePicker;

abstract class CheckEmpty
{
	public boolean filled(int x) {return x != -1;}
	public boolean filled(String x) {return  !x.isEmpty();}
	public boolean filled(DatePicker x)
	{
		return x.getValue()==null; 
	}
	public boolean filled(float x) {return x != -1;}
}

class Feedback
{
	String first_hear;
	boolean[] interested;
	public Feedback(String x,int i) {first_hear=x;for(int i1=0;i1<10;i1++) interested[i1]=false; interested[i]=true;}
	public boolean[] getInterested() {return interested;}
	public void setInterested(int i) {interested[i]=true;}
	public String getFirsthear() {return first_hear;}
	public void setFirsthear(String x) {first_hear=x;}
}

class Post_Graduate extends CheckEmpty
{
	String college,city,state,department,degree,title;
	int year,marks;
	public Post_Graduate(int x)
	{
		year=x;
		college="";city="";state="";
		department="";degree="";title="";
		marks=-1;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

class ECE extends CheckEmpty
{
	String[] preferences;
	public ECE(String a,String b,String c)
	{
		preferences=new String[4];
		preferences[0]=a;preferences[1]=b;preferences[2]=c;preferences[3]="";
	}
	public String[] getPreferences() {
		return preferences;
	}
	public void setPreferences(String[] preferences) {
		this.preferences = preferences;
	}
}

class Other_Degree extends CheckEmpty
{
	String exam_name,subject;
	int year,score,rank;
	public Other_Degree(int x) {year=x;exam_name="";subject="";score=rank=-1;}
	public int getYear() {return year;}
	public void setSubject(String x) {subject=x;}
	public String getSubject() {return subject;}
	public void setExamName(String x) {exam_name=x;}
	public String getExamName() {return exam_name;}
	public void setScore(int x) {score=x;}
	public int getScore() {return score;}
	public void setRank(int x) {rank=x;}
	public int getRank() {return rank;}
}

class Gate extends CheckEmpty
{
	String area;
	int year,rank;
	float marks,score;
	public Gate(int x) {year=x;area="";rank=-1;marks=score=-1;}
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

class Personal
{
	String email,name,mobile,add_correspondence;
	String add_permanent,father_name,nationality,pincode;
	int phd_stream;
	String[]  preference;
	String category;
	boolean gender,physically_disabled,war_category;
	DatePicker date_of_birth;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAdd_correspondence() {
		return add_correspondence;
	}
	public void setAdd_correspondence(String add_correspondence) {
		this.add_correspondence = add_correspondence;
	}
	public String getAdd_permanent() {
		return add_permanent;
	}
	public void setAdd_permanent(String add_permanent) {
		this.add_permanent = add_permanent;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public int getPhd_stream() {
		return phd_stream;
	}
	public void setPhd_stream(int phd_stream) {
		this.phd_stream = phd_stream;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public boolean getPhysically_disabled() {
		return physically_disabled;
	}
	public void setPhysically_disabled(boolean physically_disabled) {
		this.physically_disabled = physically_disabled;
	}
	public boolean getWar_category() {
		return war_category;
	}
	public void setWar_category(boolean war_category) {
		this.war_category = war_category;
	}
	public String[] getPreference() {
		return preference;
	}
	public void setPreference(String[] preference) {
		this.preference = preference;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public DatePicker getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(DatePicker date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
}

class Education 
{
	int x_year,xii_year,graduation_year;
	int ece_phd,post_graduate,other_degree,given_gate;
	float x_marks,xii_marks,graduation_marks;
	String x_board,xii_board;
	String degree,department,college,university,city,state;
	String achievements;
	Other_Degree OD;
	Gate G;
	Post_Graduate PG;
	public Education(String xb,String xiib,int yox,int yoxii,float x,float xii,String degree,String dept,String college,String univ,String city,String state,int year,int ece,int pg,int other,int sat)
	{
		achievements="";graduation_marks=-1;
		x_board=xb;xii_board=xiib;
		x_year=yox;xii_year=yoxii;
		x_marks=x;xii_marks=xii;
		this.degree=degree;department=dept;
		this.college=college;university=univ;
		this.city=city;this.state=state;
		graduation_year=year;
		ece_phd=ece;post_graduate=pg;
		other_degree=other;given_gate=sat;
	}
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
	public int getEce_phd() {
		return ece_phd;
	}
	public void setEce_phd(int ece_phd) {
		this.ece_phd = ece_phd;
	}
	public int getPost_graduate() {
		return post_graduate;
	}
	public void setPost_graduate(int post_graduate) {
		this.post_graduate = post_graduate;
	}
	public int getOther_degree() {
		return other_degree;
	}
	public void setOther_degree(int other_degree) {
		this.other_degree = other_degree;
	}
	public int getGiven_gate() {
		return given_gate;
	}
	public void setGiven_gate(int given_gate) {
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

class Payment
{
	boolean clear;
	String bank,branch,draft;
	public Payment(String a,String b,String c) {clear=false;bank=a;branch=b;draft=c;}
	public boolean isClear() {
		return clear;
	}
	public void setClear(boolean clear) {
		this.clear = clear;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDraft() {
		return draft;
	}
	public void setDraft(String draft) {
		this.draft = draft;
	}
}

public class Model implements Serializable {
	Personal P;
	Education E;
	String enrollment_number; //Yet to figure out
	Payment bank;
//	Date timestamp;
	boolean cv,sop;
	public Model(String xb,String xiib,int yox,int yoxii,float x,float xii,String degree,String dept,String college,String univ,String city,String state,int year,int ece,int pg,int other,int sat,Payment pay,String email,String name,String add_c,String mobile,int stream,String pref[],int gender,int category,int physical,int yy,int mm,int dd,int war,String fname,String nation,String p_add)
	{
//		P=new Personal(email,name,add_c,mobile,stream,pref,gender,category,physical,yy,mm,dd,war,fname,nation,p_add);
		E=new Education(xb,xiib,yox,yoxii,x,xii,degree,dept,college,univ,city,state,year,ece,pg,other,sat);
		enrollment_number="";
		bank=pay;
		cv=sop=false;
//		timestamp=new Date(); //get current date from system
	}
	public String getEnrollmentNumber() {return enrollment_number;}
	public boolean getCV() {return cv;}
	public void setCV(boolean x) {cv=x;}
	public boolean getSOP() {return sop;}
	public void setSOP(boolean x) {sop=x;}	
//	public Date getTimestamp() {return timestamp;}
}