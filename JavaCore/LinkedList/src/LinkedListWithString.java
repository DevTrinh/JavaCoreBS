import java.util.LinkedList;

public class LinkedListWithString {
    public static void display(LinkedList <String> lk){
        System.out.println();
        for(String i: lk){
            System.out.print(i+"\t");
        }
    }
    public static void main(String[]args){
        System.out.println("_____LINKED LIST_____");
        LinkedList <String> lk = new LinkedList<String>();
        for(int i = 0; i<10; i++){
            lk.add( String.valueOf(i));
        }
        display(lk);
        lk.addFirst("\nTrinh Van Manh");
        display(lk);
        lk.remove(5);
        display(lk);
        System.out.println("\nGet last: "+lk.getLast());

    }
}
