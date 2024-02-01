import java.util.Scanner;
/**
 * Bai2
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Nhap vao so nguyen bat ki :");
        x=sc.nextInt();
        if(x%2==0){
            System.out.println("So vua nhap la so chan");
        }else{
            System.out.println("So vua nhap la so le ");
        }
        sc.close();
    } 
}