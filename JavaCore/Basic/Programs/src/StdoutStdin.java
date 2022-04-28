import java.util.Scanner;
public class StdoutStdin {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        System.out.print("\nNhap String: ");
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println("\nXuat N: "+n);
        System.out.println("Xuat S: "+s);
    }
}
