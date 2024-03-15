import java.util.Scanner;

public class student {
    public String name;
    public float A;
    public float B;
    public float C;
    float trungbinh;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh");
        name = sc.nextLine();
        System.out.println("Nhap diem A:");
        A = sc.nextFloat();
        System.out.println("Nhap diem B:");
        B = sc.nextFloat();
        System.out.println("Nhap diem C:");
        C = sc.nextFloat();
 }
 public void tinhdiemTB(){
    trungbinh = A* 0.6f + B*0.3f + C*0.1f;
}
public void Xuatthongtin(){
    System.out.println("thong tin hoc sinh:");
    System.out.println("diem A:"+A);
    System.out.println("diem B:"+B);
    System.out.println("diem C:"+C);
    System.out.println("Diemtrungbinh:"+trungbinh);
}
}
