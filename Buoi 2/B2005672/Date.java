package buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date() {
		ngay = 15;
		thang = 11;
		nam = 2002;
	}
	
	public Date(int ngay1, int thang1, int nam1) {
		ngay = ngay1;
		thang = thang1;
		nam = nam1;
	}
	
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang: ");
			thang = sc.nextInt();
			System.out.println("Nhap nam: ");
			nam = sc.nextInt();
			if(!hopLe()) System.out.println("Ban nhap sai dinh dang, vui long nhap lai");
		}while(!hopLe());
	}
	
	public boolean hopLe() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(nam%4==0) max[2] = 29;
		boolean h = false;
		if(ngay>0 && thang>0 && nam>0 && thang<13 && ngay<=max[thang])
			h = true;
		return h;
	}
	
	public Date cong() {
		Date kq = new Date(ngay, thang, nam);
		kq.ngay++;
		if(!kq.hopLe()) {
			kq.ngay = 1;
			kq.thang++;
			if(!kq.hopLe()) {
				kq.thang = 1;
				kq.nam++;
			}
		}
		return kq;
	}
	public Date cong(int n) {
		Date kq = new Date(ngay, thang, nam);
		for(int i = 0; i<n; i++) {
			kq = kq.cong();
		}
		return kq;
	}
	
	public void in() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
}
	