package vuoi2;

import java.util.Scanner;

public class phanSo {
	private int tuSo, mauSo; 
	
	public phanSo() {
		tuSo = 2;
		mauSo = 9;
	}
	
	public phanSo(int x, int y) {
		tuSo = x;
		mauSo = y;
	}
	
	public int layTuSo() {
		return tuSo;
	}
	
	public int layMauSo() {
		return mauSo;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap tu so: ");
			tuSo = sc.nextInt();
			System.out.print("Nhap mau so: ");
			mauSo = sc.nextInt();
			if(mauSo == 0) System.out.println("Mau so phai khac 0, nhap lai!");
		} while (mauSo == 0 );
	}
	
	public void in() {
		if(tuSo==0) System.out.println("" + 0);
		else if(mauSo == 1) System.out.println(tuSo + "");
		else System.out.println(tuSo +"/"+ mauSo);
	}
	
	public void nghichDao() {
		System.out.println(mauSo + "/"+ tuSo);
	}
	
	public phanSo giaTriNghichDao() {
		phanSo kq = new phanSo(tuSo, mauSo);
		kq.nghichDao();
		return kq;
	}
	
	public float giaTriThuc() {
		return (float) tuSo/mauSo;
	}
	
	public boolean lonHon(phanSo a) {
		phanSo b = new phanSo(tuSo, mauSo);
		b.nhap();
		if (b.giaTriThuc() > a.giaTriThuc()) return true;
		return false;
	}
	
	public phanSo cong(phanSo a) {
		phanSo i = new phanSo(tuSo,mauSo);
		i.nhap();
		i.tuSo = i.tuSo*a.mauSo + i.mauSo*a.tuSo;
		i.mauSo = i.tuSo*a.mauSo;
		return i; 
	}
	
	public phanSo tru(phanSo a) {
		phanSo i = new phanSo(tuSo,mauSo);
		i.nhap();
		i.tuSo = i.tuSo*a.mauSo - i.mauSo*a.tuSo;
		i.mauSo = i.tuSo*a.mauSo;
		return i; 
	}
	
	public phanSo nhan(phanSo a) {
		phanSo i = new phanSo(tuSo,mauSo);
		i.nhap();
		i.tuSo = i.tuSo*a.tuSo;
		i.mauSo = i.mauSo*a.mauSo;
		return i; 
	}
	
	public phanSo chia(phanSo a) {
		phanSo i = new phanSo(tuSo,mauSo);
		i.nhap();
		i.tuSo = i.tuSo*a.mauSo;
		i.mauSo = i.mauSo*a.tuSo;
		return i; 
	}
	
	
}
