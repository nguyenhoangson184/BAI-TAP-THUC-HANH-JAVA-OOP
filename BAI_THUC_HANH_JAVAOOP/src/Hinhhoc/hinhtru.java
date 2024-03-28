package Hinhhoc;

import java.util.Scanner;

public class hinhtru extends hinhtron  {
    float chieucao;
    public hinhtru(){
        ten="Hinh tru";
    }
    public void nhapchieucao(){
        nhapbankinh();
        System.out.println("chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieucao= sc.nextFloat();
    }
    public void thetich(){
        tinhdientich();
        thetich=dientich*chieucao;
    }
    
}
