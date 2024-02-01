import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args)
     { 
        //khai báo biến
double a;
double b;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap vao so dau tien: ");
    a=scanner.nextDouble();
    System.out.print("Nhap vao so thu hai:");
    b=scanner.nextDouble();
    double tong = a + b;
    double hieu = a - b;
    double tich = a*b ;
    double thuong=a/b;
    double sodu=a%b;
    //hiển thị kết quả
    System.out.println("Tong =" + tong);
    System.out.println("Hieu =" + hieu);
    System.out.println("Tich =" + tich);
    //Điều kiện chia
    if(b==0){
        System.out.println("Khong the chia cho so 0");        
    }else{
        System.out.println("Thuong =" + thuong);
        System.out.println("sodu =" + sodu );
    }
    
    //Dùng toán tử so sánh
        if(a>b){
            System.out.println("So dau tien lon hon so thu hai");
        } 
        else{
            if(a==b){
                System.out.println("Hai so bang nhau");
            }else{
               System.out.println("So dau tien nho hon so thu hai");
            }
    } 
    scanner.close();
     }
    }
