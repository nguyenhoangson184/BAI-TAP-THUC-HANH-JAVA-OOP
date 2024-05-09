import java.util.ArrayList;

import java.util.Iterator;

public class Silde19chuong4 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
        Iterator<Float> Iterator = arrListFloat.iterator();
        System.out.println("cac phan tu co trong arrlistFloat:");
        while (Iterator.hasNext()) {
            System.out.println(Iterator.next()+"\t");
            }
            
    }
    
}
