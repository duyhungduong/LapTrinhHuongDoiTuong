package buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String [] args) {
		Date d1 = new Date(15,11,2002);
		d1.in();
		
		Date d2 = new Date();
		System.out.println("Nhap ngay d2: ");
		d2.nhap();
		System.out.println("Ngay d2: ");
		d2.in();
		d2 = d2.cong();
		d2.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cong them ngay vao d2: ");
		int n = sc.nextInt();
		
		d2 = d2.cong(n);
		System.out.println("Sau khi cong: ");
		d2.in();	
	}
}