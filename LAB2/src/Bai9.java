import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi ki tu : ");
        String chuoiKiTu = input.nextLine();
        int countNumbers = 0 , countCap = 0 , countNomarl = 0;
        for(int i=0;i < chuoiKiTu.length();i++) {
            if(chuoiKiTu.charAt(i) >= 97 && chuoiKiTu.charAt(i) <= 122 ) {
                ++countNomarl;
            } else if (chuoiKiTu.charAt(i) >= 65 && chuoiKiTu.charAt(i) <= 90) {
                ++countCap;
            } else if (chuoiKiTu.charAt(i) >= 48 && chuoiKiTu.charAt(i) <= 57) {
                ++countNumbers;
            } else {
                System.out.println("Chuoi co ki tu khong xac dinh");
            }
        }
        System.out.println("So ki tu viet thuong trong chuoi la : "+countNomarl);
        System.out.println("So ki tu viet hoa trong chuoi la : "+countCap);
        System.out.println("So ki tu chu so trong chuoi la : "+countNumbers);
    }
}
    