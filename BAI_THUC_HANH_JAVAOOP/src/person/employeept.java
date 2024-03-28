package person;

import java.util.Scanner;

public class employeept extends employee {
   public int Giolam;
   public final int Cong=150;
   public employeept(){

   }
   public void NhapGiolam(){
    Scanner sc= new Scanner(System.in);
    System.out.print("Nhap so gio lam ");
    Giolam = sc.nextInt();
   }
   public void TinhluongPT(){
    luong = Cong    * Giolam;
   }


    
    
}
