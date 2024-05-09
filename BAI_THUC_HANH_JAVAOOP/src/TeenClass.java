import java.util.ArrayList;

public class TeenClass {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        // them cac phan tu su dung phuong thuc add
        arrayListString.add("Son");
        arrayListString.add("quan");
        arrayListString.add("thinh");
        arrayListString.add("xinh");
        System.out.println("Cac phan tu co trong arrliststring la:");
        for(int i = 0;i<arrayListString.size();i++){
            System.out.println(arrayListString.get(i)+"\t");
        }
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        System.out.println("Cac phan tu co trong arrListInteger la :");
        for(int number : arrListInteger){
            System.out.println(number+"\t");
        }

    }
    
}
