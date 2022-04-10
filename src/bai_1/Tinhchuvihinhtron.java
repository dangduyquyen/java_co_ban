package bai_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tinhchuvihinhtron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double bankinh;
		double PI = 3.14159;
		System.out.print("Nhập bán kính hình tròn: ");
		try
	    { 
			bankinh= sc.nextDouble();
			double chuvi;
			chuvi = 2 * bankinh * PI;
			System.out.println("Chu vi hình tròn có bán kính " + bankinh + " là : "+chuvi);
	    }

	    catch ( InputMismatchException ex )
	    { 
	      System.out.println("Bạn đã nhập dữ liệu không hợp lệ." );
	      
	    } 
	}

}