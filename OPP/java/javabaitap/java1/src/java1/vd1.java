package java1;

import java.util.Scanner;

public class vd1 {
	public static void main(String[] args) {
		System.out.println("Nhap so a,b,c: ");
		System.out.println("Nhap a:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.println("Nhap c: ");
		int c = sc.nextInt();
		System.out.println("KQ cac phep tinh la :");
		int tong = a + b + c;
		System.out.println("Tong 3 so la " + tong);
		int hieu = a - b - c;
		if (hieu < 0)
			hieu = -hieu;
		System.out.println("Gia tri tuyet doi cua hieu la " + hieu);
		int tich = a * b * c;
		System.out.println("Tich la " + tich);
	}
}
