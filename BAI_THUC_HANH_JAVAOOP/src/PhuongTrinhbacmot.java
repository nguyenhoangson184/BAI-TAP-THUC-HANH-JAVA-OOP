import java.util.Scanner;

/**
 * PhuongTrinhBac1
 */
public class PhuongTrinhbacmot {

    public static void main(String[] args) {
        double HesoA, HesoB ,NghiemX ;
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhap A :");
         HesoA= sc.nextDouble();
         System.out.print("Nhap B :");
         HesoB = sc.nextDouble();
         System.out.println("Phuong trinh la" +HesoA+"x + "+HesoB+" =0 ");
         if(HesoA==0){
            if(HesoB==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                  System.out.println("Phuong trinh vo nghiem");
            }
        }
            else{
                NghiemX=-HesoB/HesoA;
                System.out.println("Nghiem cua phuong trinh la" +NghiemX);
            }
        
        sc.close();
    }}