package on_thi;

import java.util.Scanner;

public class BDoc {
	private int msbd;
	private String tenbd;
	private String ngsinh; 
	private boolean VIP;
	
	public BDoc() {
		msbd = 1;
		tenbd = new String();
		ngsinh = new String();
		VIP = true;
	}
	
	public BDoc(BDoc b) {
		msbd = b.msbd;
		tenbd = new String(b.tenbd);
		ngsinh = new String(b.ngsinh);
		VIP = true;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap ma so: ");
		msbd = sc.nextInt();
		
		Scanner s = new Scanner(System.in);
		System.out.print("\n Nhap ten: ");
		tenbd = s.nextLine();
		
		System.out.print("\n Nhap ngay sinh: ");
		ngsinh = s.nextLine();
		
		System.out.print("\n Kiem tra VIP: ");
		VIP = sc.nextBoolean();
		
	}
	
	public void xuat() {
		System.out.print("["+msbd+", "+tenbd+", "+ngsinh+", "+VIP+"]");
	}
	
	public static void main(String[] args) {
		BDoc bd1 = new BDoc();
		System.out.print("\n **Nhap thong tin ban doc 1");
		bd1.nhap();
		System.out.print("\n **In thong tin ban doc");
		bd1.xuat();
		
		BDoc bd2 = new BDoc(bd1);
		System.out.print("\n\n **In thong tin ban doc 2");
		bd2.xuat();
	}
}


