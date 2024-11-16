package on_thi;

import java.util.Scanner;

public class TPham extends HHoa{
	private String ngaysx, hansd;
	private char dd; // A, B, C, D
	
	public TPham() {
		ngaysx = new String();
		hansd = new String();
		dd = 0;
	}
	
	public TPham(TPham t) {
		ngaysx = new String(t.ngaysx);
		hansd = new String(t.hansd);
		dd = t.dd;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("\n Nhap ngay san xuat: ");
		ngaysx = sc.nextLine();
		
		System.out.print("\n Nhap han su dung: ");
		hansd = sc.nextLine();
		
		System.out.print("\n Nhap gia tri dinh duong: ");
		dd = sc.nextLine().charAt(0);
	}
	
	public void in() {
		super.xuat();
		System.out.print("\nNgay san xuat: "+ngaysx
				+"\nHan su dung: "+hansd+"\nGia tri dinh duong: "+dd);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n** Nhap so luong thuc pham: ");
		int n=sc.nextInt();
		
		TPham ds[]= new TPham[n];
		
		for(int i=0;i<n;i++) {
			ds[i]=new TPham();
		}
		
		System.out.print("\n** NHAP THONG TIN CAC THUC PHAM ");
		for(int i=0;i<n;i++) {
			System.out.print("\nNhap thong tin thuc pham thu "+(i+1)+": ");
			ds[i].nhap();
		}
		
		System.out.print("\n** IN THONG TIN CAC THUC PHAM ");
		for(int i=0;i<n;i++) {
			System.out.print("\nIn thong tin thuc pham thu "+(i+1)+": ");
			ds[i].in();
			System.out.print("\n");
		}
		
		System.out.print("\n** Thuc pham co gia duoi 1000000 va ham luong dd o muc A hoac B");
			for(int i=0;i<n;i++) {
			}
	}

}
