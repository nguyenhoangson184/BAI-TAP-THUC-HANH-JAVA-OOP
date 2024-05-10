import java.util.HashSet;
import java.util.Scanner;

public class silde55chuong4 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        // them cac phan tu vao trong hashsetinteger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        // hien thi cac phan tu trong hashsetinteger
        System.out.println("Cac phan tu trong hashsetinteger:");
        System.out.println(hashSetInteger);
        System.out.println("nhap phan tu can them :");
        number = sc.nextInt();
        // them mot phan tu moiw= vao hashsetinteger tu ban phim '
        // neu phan tu do da ton tai thi thong bao da ton tai nguoc lai thi them vao 
        if (hashSetInteger.contains(number)){
            hashSetInteger.add(number);
            System.out.println("them thanh cong ");
            System.out.println("cac phan tu trong hashsetinteger sau khi them :");
            System.out.println(hashSetInteger);
        }
        else{
            System.out.println("phan tu "+number+"da ton tai ");
        }
    }
    
}
