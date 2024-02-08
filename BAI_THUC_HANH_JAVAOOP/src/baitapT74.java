import java.util.Scanner;

public class baitapT74 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu mang:");
            n = sc.nextInt();

        }while (n<0);
        int a[] = new int[n];
        System.out.print("Nhap cac phan tu vao mang:");
        for(int i= 0 ; i <n; i++){
            System.out.print("Nhap phan tu thu"+i+":");
            a[i] = sc.nextInt();
        }
        double Tong =0;
        for(int i=0;i<n;i++){
            if (a[i]%2 == 0){
                Tong+=a[i];

            }
        }
        System.out.println("Tong :"+Tong);
    }
    
}
