import java.util.*;
public class Main {
    public void sapxep(int arr[]){
        int n = arr.length, t;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    public static void main(String[] args){
        int x, n; 
        Main t = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua danh sach: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap danh sach: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap x: ");
        x = sc.nextInt();
        int dem = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x) dem++;
        }
        System.out.println("Trong danh sach co " + dem + " so " + x + "\nDanh sach sau khi da sap xep: ");
        t.sapxep(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
