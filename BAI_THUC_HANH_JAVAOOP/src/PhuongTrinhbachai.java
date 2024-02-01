/**
 * PhuongTrinhBac2
 */
import java.util.Scanner;
public class PhuongTrinhbachai {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double A,B,C, x1,x2,delta;
    System.out.print("Nhap A:");
    A= sc.nextDouble();
    System.out.print("Nhap B:");
    B= sc.nextDouble();
     System.out.print("Nhap C:");
    C= sc.nextDouble();
    delta= Math.pow(B,2) +4*A*C;
    if(delta>0){
        System.out.println("Phuong trinh co hai nghiem phân biet");
        x1=(-B+Math.sqrt(delta))/2*A;
        x2= (-B- Math.sqrt(delta))/2*A;
        System.out.println("X1 :" +x1);
        System.out.println("X2 :" +x2);
}else{if(delta ==0){
    System.out.println("Phuong trinh co nghiem kep:");
    x1=x2= -B/2*A;
    System.out.println("x"+x1);
}else{
    System.out.println("Phuong trinh vo nghiem");
}
}

       
    }
}