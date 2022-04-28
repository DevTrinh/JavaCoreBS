import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class hashMap {
    public static void main(String[]args){
        System.out.println("HASHMAP");
        Map <String, Integer> info = new HashMap<String, Integer>();
        info.put("Trinh Van Manh", 2002);
        info.put("Thanh Huyen", 2002);
        info.put("Hoa Mua", 2002);
        info.put("Bao Yen", 2005);
        info.put("Linh Nhi", 2004);
        Set<String> set = info.keySet();
        for(String i : set){
            System.out.println(i + " "+ info.get(i));
        }
    }
}
