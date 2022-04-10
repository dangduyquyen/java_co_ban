package LTHDT_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class QLSV {
	public static void main(String[] args) {
		Student s1 = new Student("Nguyen Van A", "20/4/1999","nu", 7.5, 4);
		Student s2 = new Student("Nguyen Van B", "23/7/2000","nam", 7, 3);
		Student s3 = new Student("Nguyen Van C", "27/1/2002","nu", 7.5, 4);
		Student s4 = new Student("Nguyen Van D", "19/5/1998","nam", 7.5, 5);
		Student s5 = new Student("Nguyen Van E", "20/4/1999","nu", 8, 4);
		List<Student> sl = new ArrayList<>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		sl.add(s5);
		ShowList(sl);
		System.out.println("List sau khi sap xep:-------------- ");
		Collections.sort(sl);
		ShowList(sl);
		
						
	}
	public static void ShowList(List<Student> sl) {
		for (Student student : sl) {
			System.out.println(student.toString());
		}
	}
}
