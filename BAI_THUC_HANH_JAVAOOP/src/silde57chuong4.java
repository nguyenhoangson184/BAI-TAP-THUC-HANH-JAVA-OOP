import java.util.HashSet;
import java.util.Scanner;

public class silde57chuong4 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao trong hashsetstring
        hashSetString.add("java");
        hashSetString.add("python");
        hashSetString.add("c++");
        hashSetString.add("c#");
        hashSetString.add("HTML");
        hashSetString.add("PHP");
        // hien thi cac phan tu trong hashsetstring 
        System.out.println("Cac phan tu co trong hashsetstring");
        System.out.println(hashSetString);
        System.out.println("Nhap cac phan tu can xoa");
        name = sc.nextLine();
        // neu phan tu can xoa co ton tai hashsetstring thi se thong bao xoa thanh cong 
        // va hien thi cac phan tu con lai nguoc lai thong bao xoa khong thanh cong
        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu con lai trong hashsetstring :");
            System.out.println(hashSetString);
        }
        else{
            System.out.println("xoa khong thanh cong.");
        }
    }
    
}
