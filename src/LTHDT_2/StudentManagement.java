package LTHDT_2;

import java.util.ArrayList;
import java.util.List;



public class StudentManagement extends Student {
	static List<Student> StudentList = new ArrayList<>();
	public static void main(String[] args) {
		
		int chon,n;
		do {
			Menu();
			chon = sc.nextInt();
			switch (chon) {
				case 1: 
					System.out.print("nhap so luong sinh vien can them thong tin: ");
					sc.nextLine();
					n = sc.nextInt();
					Student[] s = new Student[n];
					for(int i=0; i<n; i++) {
						s[i] = new Student();
						s[i].Input();
						StudentList.add(s[i]);
					}
					break;
				case 2:
					for (Student student : StudentList) {
			            System.out.println(student);
			        }
					break;
				case 3: 
					System.out.print("Nhap nam sinh can tim kiem: ");
					sc.nextLine();
					int namsinh = sc.nextInt();
					break;
				case 4:
					break;
				case 5: 
					System.out.println("Bye!");
					break;
				default:
					System.out.println("Nhap sai!");
			}
		} while (chon!=5);
		
	}
	public static void Menu() {
		System.out.println("1: Nhap du lieu sinh vien: "
				+ "\n2: In danh sach sinh vien: "
				+ "\n3: Tim sinh vien theo nam sinh: "
				+ "\n4: Tim kiem sinh vien theo ten: "
				+ "\n5: Thoat!.");
		System.out.print("\n\t\tChon:");
	}
	

	
}
