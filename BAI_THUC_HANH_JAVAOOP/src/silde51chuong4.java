

import java.util.HashSet;
import java.util.TreeSet;

public class silde51chuong4 {
    public static void main(String[] args) {
        HashSet<Integer>HashSetInt = new HashSet<>();
        //khai bao 1 hashset cos kich thuoc khoiw tao = 32
        HashSet<Character> hashSetChar = new HashSet<>(32);
        //khai bao 1 hashset co kich thuoc khoi tao = 36
        // va yeu to tai = 0.75f(mac dinh)
        HashSet<String> hashSetString = new HashSet<>(16,0.75f);
        //khai bao 1 hashset duoc tao thanh tu 1 Collection khac 
        HashSet<Float> hashSetFloat = new HashSet<>(new TreeSet<>());
    }
    
}
