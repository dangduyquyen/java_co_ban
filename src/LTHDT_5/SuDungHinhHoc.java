package LTHDT_5;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SuDungHinhHoc {
	Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		Circle[] c = new Circle[10];
		Rectangle[] r = new Rectangle[10];
		c[0] = new Circle("Xanh", false, randomC());
		c[1] = new Circle("Do", false, randomC());
		c[2] = new Circle("Tim", false, randomC());
		c[3] = new Circle("Vang", false, randomC());
		c[4] = new Circle("Cam", false, randomC());
		c[5] = new Circle("Cham", false, randomC());
		c[6] = new Circle("Luc", false, randomC());
		c[7] = new Circle("Trang", false, randomC());
		c[8] = new Circle("Den", false, randomC());
		c[9] = new Circle("Hong", false, randomC());
		//----------------------------------------------
		r[0] = new Rectangle(null, false, randomR(), randomR());
		r[1] = new Rectangle(null, false, randomR(), randomR());
		r[2] = new Rectangle(null, false, randomR(), randomR());
		r[3] = new Rectangle(null, false, randomR(), randomR());
		r[4] = new Rectangle(null, false, randomR(), randomR());
		r[5] = new Rectangle(null, false, randomR(), randomR());
		r[6] = new Rectangle(null, false, randomR(), randomR());
		r[7] = new Rectangle(null, false, randomR(), randomR());
		r[8] = new Rectangle(null, false, randomR(), randomR());
		r[9] = new Rectangle(null, false, randomR(), randomR());
		System.out.println("Trước khi sắp sếp");
		for (Circle circle : c) {
			System.out.println(circle.toString());
		}
		System.out.println("---------------------------------------");
		for (Rectangle rectangle : r) {
			System.out.println(rectangle.toString());
		}
		
		Arrays.sort(c);
		Arrays.sort(r);
		System.out.println("Sau khi sap xep:");
		for (Circle circle : c) {
			System.out.println(circle.toString());
		}
		System.out.println("---------------------------------------");
		for (Rectangle rectangle : r) {
			System.out.println(rectangle.toString());
		}
	
	}
	public static int randomC() {
		Random rd = new Random();
		int randNumber = rd.nextInt(24)+1;
		return randNumber;
	}
	public static int randomR() {
		Random rd = new Random();
		int randNumber = rd.nextInt(14)+1;
		return randNumber;
	}
	
}
