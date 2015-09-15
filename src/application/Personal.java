package application;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
class Personal implements Serializable
{
	String email,name,mobile,add_correspondence;
	String add_permanent,father_name,nationality,pincode;
	int phd_stream;
	String[]  preference;
	String category;
	boolean gender,physically_disabled,war_category;
	LocalDate date_of_birth;
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
	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}	
}
