/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapChuoi_;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_7 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse().toString());
    }
    
}
