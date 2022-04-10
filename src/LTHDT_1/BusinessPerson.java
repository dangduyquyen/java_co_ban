package LTHDT_1;

public class BusinessPerson extends Person implements Tax {
	String name; 
	String citizenID;
	String phone;
	String email;
	double salary; 
	double business_income;
	double other_income;

	public BusinessPerson() {
		// TODO Auto-generated constructor stub
	}

	public BusinessPerson(String birthday, String gender, String blood_type, String name, String studentID,
			String phone, String email, double salary, double business_income, double other_income) {
		super(birthday, gender, blood_type);
		this.name = name;
		this.citizenID = studentID;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.business_income = business_income;
		this.other_income = other_income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return citizenID;
	}

	public void setStudentID(String studentID) {
		this.citizenID = studentID;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBusiness_income() {
		return business_income;
	}

	public void setBusiness_income(double business_income) {
		this.business_income = business_income;
	}

	public double getOther_income() {
		return other_income;
	}

	public void setOther_income(double other_income) {
		this.other_income = other_income;
	}
	
	@Override
	public String toString() {
		return "BusinessPerson [name=" + name + ", citizenID =" + citizenID + ", phone=" + phone + ", email=" + email
				+ ", salary=" + salary + ", business_income=" + business_income + ", other_income=" + other_income
				+ ", getBirthday()=" + getBirthday() + ", getGender()=" + getGender() + ", getBlood_type()="
				+ getBlood_type() + "]";
	}

	@Override
	public double payTax(double income, int star_time, int end_time) {
		income = salary + other_income + business_income;
		if(income > 50000000) {
			return (double)((income*3)/100);
		}else if(income > 10000000) {
			return (double)((income*2)/100);
		}else {
			return 0;
		}
	}

}
