package Thao_Tac_Kieu_So;

import java.util.Scanner;

public class Cau_2 {
	public static void main(String[] args) {
		System.out.print("nhập hai số nguyên kiểu int :");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nnhập số a :");
		int a = sc.nextInt();
		System.out.print("\nnhập số b : ");
		int b = sc.nextInt();
		System.out.println("a + b = " + (a + b)
				+ "\na - b = " + (a - b)
				+ "\na * b = " + (a * b)
				+ "\na / b = " + (a / b)
				+ "\na % b = " + (a % b)
				+ "\na mũ b = " + Math.pow(a,b) );
	}
}
