
package Giai_PT;

import java.util.Scanner;
public class PT_B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float a = 0,b = 0,c = 0;
		
		try {
			System.out.print("Nhập a = ");
			a = sc.nextFloat();
			System.out.print("Nhập b = ");
			b = sc.nextFloat();
			System.out.print("Nhập c = ");
			c = sc.nextFloat();
		} catch (Exception e) {
			System.out.println("Nhập sai dữ liệu. ");
		}
		
		double delta = 0;
		float x = 0;
		double x1 = 0;
		double x2 = 0;
//		delta = (b*b) - (4*a*c);
		if (a==0) {
			if(b == 0) {
				if(c == 0) {
					System.out.print("PT vô số nghiệm. ");
				}else {
					System.out.print("PT vô nghiệm. ");
				}
			}else {
				x =  -c/b;
				System.out.printf("%.4f", x);
			}
		}else {
			
			delta = (b*b) - (4*a*c);
			
			if(delta > 0) {
				x1 = (-b + Math.sqrt(delta)) / (2*a);
				x2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.printf("%.4f", x1);
				System.out.println();
				System.out.printf("%.4f", x2);
				
			}else if (delta==0) {
				x = (-b) / (2*a);
				System.out.printf("%.4f", x);
			}
			else if(delta < 0) {
				System.out.printf("No solution");
			}
				
		}
		
	}

}