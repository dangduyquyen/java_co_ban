package BaiTapVeTapTin;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhập số phần tử của mảng:");
		n = sc.nextInt();
		double[] A = new double[n];
		System.out.print("Nhập chuỗi: ");
		sc.nextLine();
		String str = sc.nextLine();
		randomArray(A, n);
		GhiFile_mang(A);
		GhiFile_string(str);
		DocFile();
		
	}
	
	public static void GhiFile_mang(double[] a) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\java_co_ban_ecl\\src\\BaiTapVeTapTin\\thaotactaptinmang.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			for(int i = 0; i< a.length; i++) {
				dos.writeDouble(a[i]);
				dos.flush();
			}
			dos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void DocFile_mang(){
		try {
			FileInputStream fis = new FileInputStream("D:\\java_co_ban_ecl\\src\\BaiTapVeTapTin\\thaotactaptinmang.txt");
			DataInputStream dis = new DataInputStream(fis);
			double doc ;
			while(true) {
				doc = dis.readDouble();
				System.out.println(doc);
			}
		
		} catch (Exception e) {
			
		}
		
	}
	
	
	
	
	public static void GhiFile_string(String s) {
			FileWriter fw;
			try {
				fw = new FileWriter("D:\\java_co_ban_ecl\\src\\BaiTapVeTapTin\\thaotactaptinstring.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(s);
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	public static void DocFile_string() throws IOException {
		try {
			FileReader fr = new FileReader("D:\\java_co_ban_ecl\\src\\BaiTapVeTapTin\\thaotactaptinstring.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while(true) {
				line = br.readLine();
				if(line != null) {
					System.out.println(line);
				}else
					break;
			}
			br.close();
			fr.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void randomArray(double[] a, int n) {
		Random rd = new Random();
		for(int i = 0 ; i<n ; i++) {
			a[i] = rd.nextDouble(100);
		}
	}
	public static void XuatMang(double[] a, int n) {
		for(int i = 0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
	public static void DocFile() throws IOException {
		DocFile_mang();
		DocFile_string();
	}
	
	
}
