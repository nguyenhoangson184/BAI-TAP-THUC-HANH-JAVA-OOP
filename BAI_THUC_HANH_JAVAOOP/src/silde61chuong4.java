import java.util.LinkedHashSet;
import java.util.Set;

public class silde61chuong4 {
    public static void main(String[] args) {
        Set<String> linkedhashSet = new LinkedHashSet<String>();
        linkedhashSet.add("Java");
        linkedhashSet.add("C++");
        linkedhashSet.add("Java");
        linkedhashSet.add("PHP");
        for(String str : linkedhashSet){
            System.out.println(str);

        }
    }
    
}
