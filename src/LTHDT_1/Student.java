package LTHDT_1;

public class Student extends Person implements Tax {
	String name; 
	String studentID;
	String phone;
	String email;

	public Student() {
		super();
	}
	
	public Student(String birthday, String gender, String blood_type, String name, String studentID, String phone,
			String email) {
		super(birthday, gender, blood_type);
		this.name = name;
		this.studentID = studentID;
		this.phone = phone;
		this.email = email;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", phone=" + phone + ", email=" + email
				+ ", getBirthday()=" + getBirthday() + ", getGender()=" + getGender() + ", getBlood_type()="
				+ getBlood_type() + "]";
	}

	@Override
	public double payTax(double income, int star_time, int end_time) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
