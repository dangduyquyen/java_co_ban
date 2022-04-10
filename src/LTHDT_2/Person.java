package LTHDT_2;

public class Person {
	String name;
	char gender;
	int bith_year;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, char gender, int bith_year) {
		super();
		this.name = name;
		this.gender = gender;
		this.bith_year = bith_year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBith_year() {
		return bith_year;
	}

	public void setBith_year(int bith_year) {
		this.bith_year = bith_year;
	}
	
	
}
