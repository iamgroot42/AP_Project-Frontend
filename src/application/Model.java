package application;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Model implements Serializable {
	Personal P;
	Education E;
	String enrollment_number; //Yet to figure out
	LocalDate timestamp;
	boolean cv,sop;
	public Personal getP() {
		return P;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public void setP(Personal p) {
		P = p;
	}
	public Education getE() {
		return E;
	}
	public void setE(Education e) {
		E = e;
	}
	public String getEnrollment_number() {
		return enrollment_number;
	}
	public void setEnrollment_number(String enrollment_number) {
		this.enrollment_number = enrollment_number;
	}
	public boolean isCv() {
		return cv;
	}
	public void setCv(boolean cv) {
		this.cv = cv;
	}
	public boolean isSop() {
		return sop;
	}
	public void setSop(boolean sop) {
		this.sop = sop;
	}	
}