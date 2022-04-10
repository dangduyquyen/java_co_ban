package LTHDT_1;

public abstract class Person {
	String birthday;
	String gender;
	String blood_type;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String birthday, String gender, String blood_type) {
		super();
		this.birthday = birthday;
		this.gender = gender;
		this.blood_type = blood_type;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}
	
	
	 
}
