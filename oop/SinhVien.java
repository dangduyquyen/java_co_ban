package oop;

public class SinhVien {
	String hoTen;
	int manSinh;
	float dtb;
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String hoTen, int manSinh, float dtb) {
		super();
		this.hoTen = hoTen;
		this.manSinh = manSinh;
		this.dtb = dtb;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getManSinh() {
		return manSinh;
	}
	public void setManSinh(int manSinh) {
		this.manSinh = manSinh;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", manSinh=" + manSinh + ", dtb=" + dtb + "]";
	}
	
	
}
