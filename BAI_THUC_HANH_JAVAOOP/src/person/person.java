package person;

import java.util.Scanner;

public class person {
public String ten;
public String Fullname;
public int age;
// cac phuong thuc nhap xuat
public void xuatten(String n)
{
    ten =n;
    System.out.println("\n\n===="+ten+"====");
}
public void nhapThongTin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Fullname:");
    Fullname = sc.nextLine();
    System.out.println("Nhap tuoi");
    age= sc.nextInt();
}
public void xuatthongtin(){
    System.out.println(Fullname+"-"+age);
}
}
