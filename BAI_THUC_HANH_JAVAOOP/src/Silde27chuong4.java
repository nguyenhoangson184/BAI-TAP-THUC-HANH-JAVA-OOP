import java.util.LinkedList;

public class Silde27chuong4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("-----------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("List A:");
        //ShowList
        System.out.println("\n vi du su dung phuong thuc retainAll()");
        System.out.println("------------------------------------------");
        //Khoi tao list B
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        // xoa nhung phan tu khong thuoc Listb khoi list A
        listA.retainAll(listB);
        System.out.print("listA:");
        //ShowList(listA);
        System.out.println(
            
        );

    }
    
}
