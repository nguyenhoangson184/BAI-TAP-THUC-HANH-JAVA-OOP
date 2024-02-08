import java.util.Scanner;

public class baitapT81 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so dong cua ma tran:");
        m= sc.nextInt();
        System.out.print("Nhap vao so cot cua ma tran");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Nhap cac phan tu cho ma tran");
        for (int i=0;i<m;i++){
            for(int j= 0;j<n;j++){
            System.out.print("a["+i+"]["+j+"]=");
                a[i][j] =sc .nextInt();

            }
        }
        int max = a[0][0];
        for (int i =0 ; i<m;i++){
            for(int j=0;j<n;j++){
                if(max <a[i][j]){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran :"+max);
    }
    
}
