package on_thi;

import java.util.Scanner;

public class TheMuon {
	private BDoc bdoc;
	private int mst;
	private String nmuon, ntra;
	
	
	public TheMuon() {
		bdoc = new BDoc();
		mst = 1;
		nmuon = new String();
		ntra = new String();
	}
	
	public TheMuon(TheMuon t) {
		bdoc = new BDoc(t.bdoc);
		mst = t.mst;
		nmuon = new String(t.nmuon);
		ntra = new String(t.ntra);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap thong tin ban doc");
		bdoc.nhap();
		System.out.print("\n Nhap ma so the: ");
		mst = sc.nextInt();
		
		Scanner s = new Scanner(System.in);
		System.out.print("\n Nhap ngay muon sach: ");
		nmuon = s.nextLine();
		
		System.out.print("\n Nhap ngay tra sach: ");
		ntra = s.nextLine();
		
	}
	
	public void xuat() {
		bdoc.xuat();
		System.out.print(" + "+"["+mst+","+nmuon+","+"ntra"+"]");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n **Nhap so luong nguoi muon: ");
		int n = sc.nextInt();
		
		TheMuon ds[]= new TheMuon[n];
		 for(int i=0;i<n;i++) {
			 ds[i]=new TheMuon();
		 }
		 
		 System.out.print("\n **NHAP danh sach thong tin nguoi muon");
		 for(int i=0;i<n;i++) {
			 System.out.print("\n Nhap t.tin nguoi muon thu "+(i+1));
			 ds[i].nhap();
		 }
		 
		 System.out.print("\n\n **IN danh sach thong tin nguoi muon");
		 for(int i=0;i<n;i++) {
			 System.out.print("\n In t.tin nguoi muon thu "+(i+1));
			 ds[i].xuat();
		 }
		 
		 System.out.print("\n**Ma so ban muon sach hon 36 ngay");
		 
		 
	}

}
