import java.util.Scanner;
public class baitapT47 {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc =new Scanner(System.in);
        do{
        System.out.println("Nhap so nguyen n :");
        n = sc.nextInt();
        sum = sum + n;}
        while(sum<100);
        System.out.println("Tong so nguyen vua nhap : "+sum);
    } 
    
}
