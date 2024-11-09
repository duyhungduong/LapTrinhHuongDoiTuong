import java.util.Scanner;

public class Bai07{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String s = sc.nextLine();
        s = s.trim();
        s= s.replaceAll("\\s+", " ");
        String[] ten = s.split(" ");
        for (String w : ten) {
            System.out.println(w);
        }
    }
}