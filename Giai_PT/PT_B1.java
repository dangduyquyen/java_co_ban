
package Giai_PT;

import java.util.Scanner;

public class PT_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\t\t\tGiải phương trình bật nhất 1 ẩn: ");
        double a = 0, b = 0;
        try {
        	System.out.print("\tNhập số a: ");
            a = sc.nextDouble();
            System.out.print("\tNhập số b: ");
            b = sc.nextDouble();
		} catch (Exception e) {
			System.out.print("nhập sai dữ liêu");
		}
        
        if((a != 0)){
                System.out.println("\n\tPhương trình "+ a + "x + " + b + " = 0 có nghiệm là: " + (-b/a) );
        }else if ((a==0) && (b!=0)){
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Phương trình có vô số nghiệm");
        }
    
    }
    
}