/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapDieuKien_25_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_10 {
    public static void main(String[] args) {
        final String USERNAME001 = "HuyHoang";  
        final String PASSWORD001 = "2021";
        Scanner sc = new Scanner(System.in);
        String userName001;
        String passWord001;
        // Nhập tài khoản
        System.out.println("\n\n\n\t\t\t Nhập username and password: ");
        System.out.print("\n\tNhập Username: ");
        userName001 = sc.nextLine();
        System.out.print("\n\tNhập Password: ");
        passWord001 = sc.nextLine();
//        System.out.println(passWord001 + userName001);
        if((userName001.equals(USERNAME001)) && (passWord001.equals(PASSWORD001))){
            System.out.println("\n\t\tNHẬP ĐÚNG" +"(" + userName001 + ", " + passWord001 + ")" );
        }else{
            System.out.println("\n\t\tNHẬP SAI usernam hoặc password");
        }
    }
}