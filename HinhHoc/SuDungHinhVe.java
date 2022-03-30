package HinhHoc;

public class SuDungHinhVe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron ht = new HinhTron(12);
		HinhChuNhat hcn = new HinhChuNhat(12,5);
		System.out.println("chu vi hinh tron: " + ht.tinhChuVi());
		System.out.println("dien tich hinh tron: " + ht.tinhDienTich());
		System.out.println("chu vi hinh chu nhat: " + hcn.tinhChuVi());
		System.out.println("dien tich hinh chu nhat: " + hcn.tinhDienTich());
	}

}
