package Hinhhoc;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    public hinhvuong(){
        ten="Hinh Vuong";
    }
    public void nhapcanh(){
        System.out.println("Nhap canh:");
        Scanner sc = new Scanner(System.in);
        dai = rong= sc.nextFloat();
    }
    
}
