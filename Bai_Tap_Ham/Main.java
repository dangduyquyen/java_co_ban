package Bai_Tap_Ham;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	// cau 1;
	private static void XuatTB() {
        System.out.println("Lập trình Java 2021");
    }
	// cau 2;
	 private static void Nhap_Xuat() {
		    System.out.print("Nhập vào một chuỗi ký tự: ");
		    String str = sc.nextLine();
		    System.out.print(str);
	 }
	 
	 // cau 3;
	 private static void Cau_3() {
	        int n;
	        
	        do{
	            System.out.print("Nhập vào một số: ");
	            n = sc.nextInt();
	        }while (n <= 0);
	        for(int i = 1; i <= n ; i++){
	            Nhap_Xuat();
	            System.out.println();
	        }
	 }
	 
	 private static void GiaiPTB1(float a, float b) {
		 if((a != 0)){
             System.out.println("\n\tPhương trình "+ a + "x + " + b + " = 0 có nghiệm là: " + (-b/a) );
	     }else if ((a==0) && (b!=0)){
	    	 System.out.println("Phương trình vô nghiệm");
	     }else {
	         System.out.println("Phương trình có vô số nghiệm");
	     }
	 }
	 private static void GiaiPTB2(float a, float b, float c) {
	        if (a == 0) {
	            GiaiPTB1(b, c);
	        }else {
	        	float delta = b*b - 4*a*c;
		        float x1;
		        float x2;
		        // tính nghiệm
		        if (delta > 0) {
		            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
		            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
		            System.out.println("Phương trình có 2 nghiệm là: "
		                    + "x1 = " + x1 + " và x2 = " + x2);
		        } else if (delta == 0) {
		            x1 = (-b / (2 * a));
		            System.out.println("Phương trình có nghiệm kép: "
		                    + "x1 = x2 = " + x1);
		        } else {
		            System.out.println("Phương trình vô nghiệm!");
		        }
	        }
	        
	 }
	 private static void LuaChonGiaiPT() {
	        System.out.print("\n1: Giải phương trình bật nhất:"
	                + "\n2: Giải phương trình bật hai:"
	                + "\nNhập lựa chọn: ");
	        int chon = sc.nextInt();
	        switch(chon){
	            case 1:{
	                System.out.print("nhập a: ");
	                float a = sc.nextFloat();
	                System.out.print("nhập b: ");
	                float b = sc.nextFloat();
	                GiaiPTB1(a, b);
	            break;
	            } 
	            case 2: {
	                System.out.print("nhập a: ");
	                float a = sc.nextFloat();
	                System.out.print("nhập b: ");
	                float b = sc.nextFloat();
	                System.out.print("nhập b: ");
	                float c = sc.nextFloat();
	                GiaiPTB2(a, b, c);
	            break;
	            }
	        }  
	 }
	 private static void LuaChonGiaiPT_01() {
	        boolean flag = true;
	        do{
	            System.out.print("\n1: Giải phương trình bật nhất:"
	                    + "\n2: Giải phương trình bật hai:"
	                    + "\nChọn số khác để thoát: "
	                    + "\nNhập lựa chọn: ");
	            int chon = sc.nextInt();
	            switch(chon){
	                case 1:{
	                    System.out.print("nhập a: ");
	                    float a = sc.nextFloat();
	                    System.out.print("nhập b: ");
	                    float b = sc.nextFloat();
	                    GiaiPTB1(a, b);
	                break;
	                } 
	                case 2: {
	                    System.out.print("nhập a: ");
	                    float a = sc.nextFloat();
	                    System.out.print("nhập b: ");
	                    float b = sc.nextFloat();
	                    System.out.print("nhập b: ");
	                    float c = sc.nextFloat();
	                    GiaiPTB2(a, b, c);
	                break;
	                }
	                default:
	                    System.out.println("Bye!!");
	                    flag = false;
	                    break;
	            }
	  
	        }while(flag);
	 }
	 public static void main(String[] args) {
		LuaChonGiaiPT_01();
	}
	 
	 
}
