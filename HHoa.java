package on_thi;

import java.util.Scanner;

public class HHoa {
	private String ten;
	private int mhh, slg;
	private float dgia;
	
	public HHoa() {
		ten = new String();
		mhh = 0;
		slg = 0;
		dgia = 0.0f;
	}
	
	public HHoa(HHoa h) { //Hàm xây dựng sao chép
		ten = new String(h.ten);
		mhh = h.mhh;
		slg = h.slg;
		dgia = h.dgia;
	}
	
	public float layDgia() {
		return dgia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap ma so hang hoa: ");
		mhh = sc.nextInt();
		
		Scanner s = new Scanner(System.in);
		System.out.print("\n Nhap ten hang hoa: ");
		ten = s.nextLine();
		
		System.out.print("\n Nhap don gia: ");
		dgia = s.nextFloat();
		
		System.out.print("\n Nhap so luong hang: ");
		slg = s.nextInt();
		
	}
	
	public void xuat() {
		System.out.print("["+mhh+" - "+ten+" - "+dgia+" - "+slg+"]" );
	}
	
	public static void main(String[] args) {
		HHoa hh1 = new HHoa();
		System.out.print("\n **Nhap thong tin hang hoa hh1");
		hh1.nhap();
		
		System.out.print("\n **Xuat thong tin hang hoa hh1");
		hh1.xuat();
		
		HHoa hh2 = new HHoa(hh1);
		System.out.print("\n **Xuat thong tin hang hoa hh2");
		hh2.xuat();

	}

}


