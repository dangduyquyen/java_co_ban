package LTHDT_2;

import java.util.Scanner;

public class Student extends Person {
	String studentID;
	int academic_year;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, char gender, int bith_year, String studentID, int academic_year) {
		super(name, gender, bith_year);
		this.studentID = studentID;
		this.academic_year = academic_year;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getAcademic_year() {
		return academic_year;
	}

	public void setAcademic_year(int academic_year) {
		this.academic_year = academic_year;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", academic_year=" + academic_year + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getBith_year()=" + getBith_year() + "]";
	}
	static Scanner sc = new Scanner(System.in);
	public void Input() {
		sc.nextLine();
		System.out.print("Nhap ten: ");
		name = sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gender = sc.next().charAt(0);
		System.out.print("Nhap nam sinh: ");
		bith_year = sc.nextInt();
		System.out.print("Nhap ID: ");
		studentID = sc.next();
		System.out.print("Nhap nam hoc: ");
		academic_year = sc.nextInt();
		System.out.println("---------------------------------");
	}
	
	
	
	
}
