package Bai_Tap_Slide_52;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhập số tiền vay :");
			double sotienvay = sc.nextDouble();
			System.out.print("Nhập lãi suất hàng tháng :");
			double laisuat = sc.nextDouble();
			System.out.print("nhập số năm :");
			int sonam = sc.nextInt();
			double monthlyPayment;
			monthlyPayment = (sotienvay * laisuat)/(1-(1/(Math.pow((1+laisuat),(sonam*12)))));
			System.out.println("Monthly Payment: " + monthlyPayment);
		} catch (Exception ex) {
			System.out.print("nhập sai dữ liêu");
		}
		
		
	}
}
