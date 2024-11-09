package buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.println("Toa do diem A: ");
		A.in();
		
		Diem B = new Diem();
		System.out.println("Nhap toa do diem B: ");
		B.nhap();
		System.out.println("Toa do diem B: ");
		B.in();
		
		Diem C = new Diem(-B.layX(), -B.layY());
		System.out.println("Toa do diem C: ");
		C.in();
		
		System.out.println("Khoang cach tu B0= " +B.khoangCach());
		System.out.println("Khoang cach tu BA= " + B.khoangCach(A));
		
		System.out.println("Tinh tien diem B voi (3,7): ");
		B.tinhTien(3, 7);
		B.in();
		
	}
}
