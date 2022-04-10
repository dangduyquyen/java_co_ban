package HinhHoc;

public class HinhChuNhat {
	double chieuDai;
	double chieuRong;
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}
	public HinhChuNhat(double chienDai, double chieuRong) {
		super();
		this.chieuDai = chienDai;
		this.chieuRong = chieuRong;
	}
	public double getChienDai() {
		return chieuDai;
	}
	public void setChienDai(double chienDai) {
		this.chieuDai = chienDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public double tinhChuVi() {
		return 2*(chieuDai + chieuRong);
	}
	
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}
	
	
	
}
