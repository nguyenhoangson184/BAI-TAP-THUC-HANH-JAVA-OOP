package Hinhhoc;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    float bankinh;
    public hinhtron(){
        ten = "Hinh tron";
    }
    void nhapbankinh(){
        System.out.println("Ban kinh =");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    void tinhchuvi(){
        chuvi= 2*pi*bankinh;
    }
    void tinhdientich(){
        dientich= pi *bankinh*bankinh;
    }

    
}
