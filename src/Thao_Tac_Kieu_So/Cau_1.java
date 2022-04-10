package Thao_Tac_Kieu_So;

import java.util.Scanner;

public class Cau_1 {
	public static void main(String[] args) {
		System.out.print("nhập hai số nguyên kiểu byte :");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nnhập số a :");
		Byte a = sc.nextByte();
		System.out.print("\nnhập số b : ");
		Byte b = sc.nextByte();
		System.out.println("a + b = " + (a + b)
				+ "\na - b = " + (a - b)
				+ "\na * b = " + (a * b)
				+ "\na / b = " + (a / b)
				+ "\na % b = " + (a % b)
				+ "\na mũ b = " + Math.pow(a,b) );
	}
}
