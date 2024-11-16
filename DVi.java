package on_thi;

import java.util.Scanner;

public class DVi {
	private String mdv, tendv;
	private int giuong;
	private boolean dchien;
	
	public DVi() {
		mdv = new String();
		tendv = new String();
		giuong = 00;
		dchien = false;
	}
	
	public DVi(DVi dv) {
		mdv = new String(dv.mdv);
		tendv = new String(dv.tendv);
		giuong = dv.giuong;
		dchien = false;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap ma so: ");
		mdv = sc.nextLine();
		
		System.out.print("\n Nhap ten : ");
		tendv = sc.nextLine();
		
		System.out.print("\n Nhap so giuong benh: ");
		giuong = sc.nextInt();
		
		System.out.print("\n Benh vien da chien: ");
		dchien = sc.nextBoolean();
		
	}
	
	public void xuat() {
		System.out.print("["+mdv+" - "+tendv+" - "+giuong+" - "+dchien+"]" );
	}
	
	public static void main(String[] args) {
		DVi dv1 = new DVi();
		System.out.print("\n **Nhap thong tin cho don vi dv1");
		dv1.nhap();
		
		System.out.print("\n **Xuat thong tin cho don vi dv1");
		dv1.xuat();
		
		DVi dv2 = new DVi(dv1);
		System.out.print("\n **Xuat thong tin cho don vi dv2");
		dv2.xuat();

	}

}
