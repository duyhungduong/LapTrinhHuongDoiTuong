import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        System.out.println("Xin chao!");
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("a = "+a+ ", b =  "+b); 
        System.out.println("Tong = " +a+" + "+b+" = "+(a+b));
    }
}
