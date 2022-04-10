package LTHDT_1;

public class TaxManagement {
	public static void main(String[] args) {
		Student s = new Student("20/1/2002", "nam", "O", "Dang duy quyen", "20T1080048", "0868626604", "quyen@gmail.com");
		Worker w = new Worker("3/4/2002", "nam", "O", "Nguyen Van Vu", "232211563", "0831252454", "vu@gmail.com", 10000000, 6000000);
		BusinessPerson b = new BusinessPerson("20/10/2002", "nu", "O", "Nguyen nhu Quynh", "523153443", "098948283", "quynh@gmail.com", 20000000, 30000000, 1000000);		
		
		System.out.println(s+ " Thue phai tra: " + s.payTax(1000000, 0, 0));
		System.out.println(w+ " Thue phai tra: " + w.payTax(0, 0, 0));
		System.out.println(b+ " Thue phai tra: " + b.payTax(0, 0, 0));
	}

}
