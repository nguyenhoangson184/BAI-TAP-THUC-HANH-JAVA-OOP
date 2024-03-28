package Hinhhoc;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    float dai,rong;
    public hinhchunhat(){
        ten="Hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.println("Chieu dai:");
        Scanner sc= new Scanner(System.in);
        dai= sc.nextFloat();
    }
    public void nhapchieurong(){
        System.out.println("Nhap chieu rong");
        Scanner sc= new Scanner(System.in);
        rong = sc.nextFloat();
    }
    void chuvi(){
        chuvi=(dai+rong)*2;
    }
    void dientich(){
        dientich = dai * rong;
    }
    
}
