import java.util.ArrayList;
import java.util.Collections;
public class DemoWithString {
    public static void main(String[]args){
        System.out.println("_____ARRAY LIST_____");
        ArrayList<String> arr =  new ArrayList<String>();
        arr.add("Trinh Van Manh");
        arr.add("Le Thi Hoa");
        arr.add("Thanh Huyen");
        arr.add("Ngo Khanh Linh");
        arr.add("Nguyen Ha Thuong");
        for(String i : arr){
            System.out.println(i);
        }
        System.out.println("\n\nAfter Remove ");
        arr.remove(4);
        System.out.println("For each");

        for(String i : arr){
            System.out.println(i);
        }
        Collections.sort(arr);
        System.out.println("\n\nFOR");
        for(int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
