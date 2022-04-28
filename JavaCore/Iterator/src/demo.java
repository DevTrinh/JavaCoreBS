import java.util.Iterator;
import java.util.ArrayList;


public class demo {
    public static void main(String[]args){
        System.out.println("Demo Iterator Java");
        ArrayList <String> arrString = new ArrayList<String>();
        arrString.add("Trinh Van Manh");
        arrString.add("Thanh Huyen");
        arrString.add("Hoa Mua");
        arrString.add("Collection");
        Iterator<String> iS = arrString.iterator();
        while(iS.hasNext()){
            System.out.println(iS.next());
        }
    }
}
