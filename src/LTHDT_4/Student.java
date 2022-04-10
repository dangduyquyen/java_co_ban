package LTHDT_4;

import java.io.Serializable;

public class Student implements Cloneable, Comparable<Student>, Serializable {
	String fullname;
	String birthdate;
	String gender;
	double gpa;
	int social_activities;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String fullname, String birthdate, String gender, double gpa, int social_activities) {
		super();
		this.fullname = fullname;
		this.birthdate = birthdate;
		this.gender = gender;
		this.gpa = gpa;
		this.social_activities = social_activities;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getSocial_activities() {
		return social_activities;
	}

	public void setSocial_activities(int social_activities) {
		this.social_activities = social_activities;
	}
	

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", birthdate=" + birthdate + ", gender=" + gender + ", gpa=" + gpa
				+ ", social_activities=" + social_activities + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(getGpa() == o.getGpa() && getSocial_activities() == o.getSocial_activities()) {
			return 0;
		}else if(getGpa() > o.getGpa() || getGpa() == o.getGpa() && getSocial_activities() > o.getSocial_activities()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}
