package person;

import java.util.Scanner;

public class employeefulltime extends employee{
    public int LuongTB =250;
    public int Ngaylam;
    public employeefulltime(){

    }
    public void Nhapsongaylam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay lam trong 1 thang");
        Ngaylam= sc.nextInt();

    }
    public void TinhLuongFT(){
        luong= LuongTB * Ngaylam;
    }
    
}
