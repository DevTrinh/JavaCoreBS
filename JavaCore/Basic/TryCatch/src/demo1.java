import java.util.Scanner;

public class demo1 {
    public static void checkAge(int age){
        if(age <18){
            throw new ArithmeticException("Quyền truy cập bị từ chối - Bạn phải từ 18 tuổi trở lên.");
        }
        else{
            System.out.println("Đã cấp quyền truy cập, bạn đã đủ 18 tuổi");
        }
    }

    public static void main(String[]args){
        try{ //thực thi code trong try nếu có lỗi sẽ thực thi tại catch
            System.out.println("Try Catch Java !");
            System.out.print("Vi Du: ");
            int myNumber[] = {1,2,3,4,5};
            System.out.println(myNumber[11]);
        }
        catch(Exception e){
            System.out.println("Loi khong co phan tu myNumber[11] !");
        }
        finally{ //thực thi mã bất kể câu lệnh try catch như thế nào
            System.out.println("Try Catch is complete !");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Moi ban nhap tuoi: ");
        int age = sc.nextInt();
        checkAge(age);

    }
}
