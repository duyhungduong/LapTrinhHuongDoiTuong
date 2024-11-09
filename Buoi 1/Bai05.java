import java.util.Scanner;

public class Main{
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap he so b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap he so c: ");
        float c = sc.nextFloat();
        Main.Bac2(a,b,c);
    }
    public static void Bac1(float a, float b){
        if ( a==0){
            System.out.print("Phuong trinh vo nghiem!");
        }
        else{
            System.out.print("Phuong trinh co nghiem: " + (-b/a));
        }
        return;
    }
    public static void Bac2(float a, float b, float c){
        if( a==0){
            if ( b == 0){
                System.out.print("Phuong trinh vo nghiem!");
            }
            else Bac1(b,c);
        return;
        }
        double Delta = Math.pow(b,2) - 4*a*c;
        double x1 = (-b + Math.sqrt(Delta))/ 2*a;
        double x2 = (-b - Math.sqrt(Delta))/ 2*a;
        if ( Delta > 0){
            System.out.print("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + "x2 = " + x2);
        }
        else if ( Delta < 0){
            System.out.print("Phuong trinh vo nghiem!");
        }
        else{
            System.out.print("Phuong trinh co nghiem kep: x1 = x2 = " + ( -b/2*a));
        }
    }
}
