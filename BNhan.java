package on_thi;

import java.util.Scanner;

public class BNhan {
	private DVi dvi;
	private String ten;
	private String ngay;
	private float cnang;
	
	public BNhan() {
		dvi = new DVi();
		ten = new String();
		ngay = new String();
		cnang = 0.0f;
		
	}
	
	public BNhan(BNhan b) {
		dvi = new DVi(b.dvi);
		ten = new String(b.ten);
		ngay = new String(b.ngay);
		cnang = b.cnang;
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap thong tin don vi dieu tri benh nhan");
		dvi.nhap();
		System.out.print("\n Nhap ten benh nhan: ");
		ten = sc.nextLine();
		
		System.out.print("\n Nhap ngay nhap vien: ");
		ngay = sc.nextLine();
		
		System.out.print("\n Nhap can nang: ");
		cnang = sc.nextFloat();
	}
	
	public void xuat() {
		dvi.xuat();
		System.out.print("-"+"["+ten+","+ngay+","+cnang+"]");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n**Nhap so luong doi tuong: ");
		int n = sc.nextInt();
		
		BNhan ds[] = new BNhan[n];
		for(int i=0;i<n;i++) {
			ds[i]=new BNhan();
		}
		System.out.print("\n**NHAP thong tin benh nhan");
		for(int i=0;i<n;i++) {
			ds[i].nhap();
		}
		
		System.out.print("\n\n");
		
		System.out.print("\n**IN thong tin benh nhan");
		for(int i=0;i<n;i++) {
			System.out.print("\n");
			ds[i].xuat();
			System.out.print("\n");
		}
		System.out.print("\n\n");
		
		System.out.print("\n **Thong tin ma don vi van chuyen");
		for(int i=0;i<n;i++) {
			if((ds[i].ten.equals("Tran Anh Hao")) && (ds[i].ngay.equals("21-11-2021"))) {
				System.out.print("\n");
				ds[i].xuat();
			}
		}
		
		
	}

}
