import java.util.Scanner;

public class Employee {
    public int Manv;
    public String name;
    public float luong , phucap,tongket;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nv:");
        name = sc. nextLine();
        System.out.println("Nhap Manv:");
        Manv = sc.nextInt();
        System.out.println("Nhap luong:");
        luong = sc.nextInt();
        System.out.println("Nhap phu cap:");
        phucap = sc.nextInt();
}
void tinhluong(){
    tongket = luong + phucap;
}
void inthongtin(){
    System.out.println("Nhap ten nv:");
    System.out.println("Nhap Manv"+name);
    System.out.println("Nhap luong"+luong);
    System.out.println("Nhap phu cap "+ phucap);
    System.out.println("Luong thuc nhan"+tongket);
}


    
}
