import java.util.Scanner;

public class Demo1 {
    public static void main(String[]args){
        System.out.println("Xin chao Trinh Van Manh");
        System.out.println("Day laf trinh van manh");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int n = sc .nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            System.out.printf("Nhap Arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("\nXuat Arr:");
        for(int i = 0; i<n; i++){
            System.out.printf("Arr[%d] = %d\t", i, arr[i]);
        }
        System.out.println("\nSap xep");
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print("Arr["+i+"] = "+arr[i]);
        }
    }
}
