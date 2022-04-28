import java.util.ArrayList;
import java.util.Collections;

//Nên dùng Array List khi truy xuất phần tử nhiều hơn là cập nhật phần tử
//để cập nhật thì nên dùng LinkedList để truy xuất phần tử

public class ArrWithInteger {
    public static void main(String[]args){
        System.out.println("_____ARRAY LIST WITH INTEGER_____");
        ArrayList<Integer> ArrInt = new ArrayList<Integer>();
        for(int i = 10; i>=0; i--){
            ArrInt.add(i);
        }
        for(Integer i : ArrInt){
            System.out.print(i+"\t");
        }
        for(int i = 0; i<ArrInt.size(); i++){
            if(ArrInt.get(i) % 2 == 0){
                ArrInt.remove(i);
            }
        }
        System.out.println("\nAfter remove");
        for(Integer i: ArrInt){
            System.out.print(i+"\t");
        }
        ArrInt.set(4,100);
        System.out.println();
        for(Integer i : ArrInt){
            System.out.print(i+"\t");
        }
    }
}
