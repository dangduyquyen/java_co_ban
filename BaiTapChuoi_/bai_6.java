package BaiTapChuoi_;
import java.util.Scanner;
public class bai_6
{
   public static void main(String[] args)
   {
        String chuoi;
        char kiTu;
        boolean tonTai = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        chuoi = sc.nextLine();
        System.out.println("Nhập vào ký tự muốn kiểm tra:");
        kiTu = sc.nextLine().charAt(0);
        int dem = 0;

        char mangKiTu[] = chuoi.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++)
        {
            if (kiTu == mangKiTu[i])
            {
            System.out.println("vị trí xuất hiện của kí tự: " + (i+1) + " ");
            dem++;
            }
        }
        System.out.println("Số lần Xuất hiện: " + dem);
    }
}