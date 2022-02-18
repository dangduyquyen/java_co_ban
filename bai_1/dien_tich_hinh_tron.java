package bai_1;

import java.util.Scanner;

public class dien_tich_hinh_tron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double bankinh;
		System.out.print("Nhập bán kính hình tròn: ");
		bankinh= sc.nextDouble();
		double dientich;
		dientich = (bankinh*bankinh)*3.14159; 
		System.out.println("diện tích hình tròn có bán kính " + bankinh + " là : "+dientich);
		
	}

}
