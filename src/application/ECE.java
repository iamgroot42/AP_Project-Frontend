package application;

//@author : Anshuman Suri : 2014021
//Please read the README.md before testing the application 

import java.io.Serializable;

@SuppressWarnings("serial")
class ECE extends CheckEmpty implements Serializable
{
	String[] preferences;
	public String[] getPreferences() {
		return preferences;
	}
	public void setPreferences(String[] preferences) {
		this.preferences = preferences;
	}
}