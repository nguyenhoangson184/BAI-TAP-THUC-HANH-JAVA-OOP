public class Silde39chuong4 {
    public static void showList(LinkedList<String> someList) {
        for(String x : someList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
   
        LinkedList<String> linkedList = new LinkedList<>();

   
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("PHP");
        linkedList.add("Java");

        linkedList.add(0, "Head");
        linkedList.add(linkedList.size() - 1, "Last");

    
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.addAll(linkedList);
     
        System.out.println("Day la du lieu cua linkedList 1 : ");
        showList(linkedList);
        System.out.println();
        System.out.println("Day la du lieu linkedList 2 : ");
        showList(linkedList2);
        System.out.println();

        linkedList.addFirst("000");
        linkedList.addLast("999");
        
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Java");
        // Xoa nhung phan tu khong thuoc list3 khoi list1
        linkedList.retainAll(linkedList3);
        System.out.println("LinkedList 1 : ");
        showList(linkedList);
        System.out.println();

        linkedList.removeAll(linkedList3);
        System.out.println("Nhung phan tu cua linkedList 1 : ");
        showList(linkedList);
    
}
}