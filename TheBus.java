// 22 - B2005746 - Kim Thi Thanh Chi - Nhom 05

package B2005746;

import java.util.Scanner;


public class TheBus {
	private KHang khang;
	private String mathe, ngayph;
	private char loai;
	
	public void nhap() {
		khang.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap ma the the buyt:");
		mathe = new String();
		mathe = sc.nextLine();
		System.out.print("\n Nhap ngay phat hanh the buyt:");
		ngayph = sc.nextLine();
		
		System.out.print("\n Nhap loai the buyt:");
		loai = sc.nextLine().charAt(0);
	}
	
	public void in() {
		khang.in();
		System.out.print("- Ma the: "+mathe+", ngay phat hanh: "+ngayph+", loai the: "+loai);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap so luong doi tuong the bus: ");
		int m = sc.nextInt();
		
		TheBus ds1[]= new TheBus[m];
		for(int i = 0; i<m;i++) {
			ds1[i]= new TheBus();
		}
		
		System.out.print("\n Nhap thong tin the bus");
		for(int i = 0; i<m;i++) {
			ds1[i].nhap();
		}
		
		System.out.print("\n Thong tin the bus da nhap");
		for(int i =0; i<m;i++) {
			ds1[i].in();
		} 
		
		

	}

}
