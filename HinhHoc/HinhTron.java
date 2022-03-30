package HinhHoc;

public class HinhTron {
	double banKinh;
	public HinhTron() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}
	
	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public double tinhChuVi() {
		return  2 * banKinh * 3.14159;
		 
	}
	
	public double tinhDienTich() {
		return (banKinh*banKinh)*3.14159;
	}
}
