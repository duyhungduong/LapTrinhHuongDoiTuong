package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}
	public void gan(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public void ganX(int x1) {
		x = x1;

	}
	public void ganY(int y1) {
		y = y1;
	}
	public void gan() {
		x = 0;
		y = 0;
		
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hoanh do x: ");
		x = sc.nextInt();
		System.out.println("Nhap tung do y: ");
		y = sc.nextInt();
	}
	
	public void in() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public void in(String s) {
		System.out.println(s);
		in();
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
	public void tinhTien(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public float khoangCach() {
		float kq= (float) Math.sqrt(Math.pow(x,2) + y*y);
		return kq;
	}
	
	public float khoangCach(Diem B) {
		return (float) Math.sqrt(Math.pow(x - B.x,2) + Math.pow(y - B.y,2));
	}
	
	public int layX() {
		return x;
	}
	
	public int layY() {
		return y;
	}
	
}
