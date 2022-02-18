package Thao_Tac_Kieu_So;

import java.util.Scanner;

public class Cau_3 {
	public static void main(String[] args) {
		System.out.print("nhập hai số nguyên kiểu double  :");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nnhập số a :");
		Double a = sc.nextDouble();
		System.out.print("\nnhập số b : ");
		Double b = sc.nextDouble();
		System.out.println("a + b = " + (a + b)
				+ "\na - b = " + (a - b)
				+ "\na * b = " + (a * b)
				+ "\na / b = " + (a / b)
				+ "\na mũ b = " + Math.pow(a,b) );
	}
}
