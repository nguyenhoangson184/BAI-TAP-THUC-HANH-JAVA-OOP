package person;

import java.util.Scanner;

public class employee extends person {
    public String quequan;
    public String cccd;
    public double luong;
    public employee(){
        //ten = "Employee";
    }
    public void NhapthongtinNV(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Que quan");
        quequan = sc.nextLine();
        System.out.println("CCCD:");
        cccd=sc.nextLine();
    }
    public void indiachi()
    {
        xuatthongtin();
        System.out.println("Can cươc cong dan"+cccd);
        System.out.println("Que quan"+quequan);
 }
 public void TongLuong(){
    System.out.println("Tong luong="+luong);
 }
}
