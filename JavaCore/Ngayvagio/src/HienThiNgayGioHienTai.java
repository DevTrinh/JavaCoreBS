import java.time.LocalDate;
//khai bao thu vien ngay
import java.time.LocalDateTime;
//khai bao thu vien ngay va gio
import java.time.LocalTime;
public class HienThiNgayGioHienTai {
    public static void main(String[]args){
        System.out.println("hien thi thoi gian thuc");
        LocalDate date1 =  LocalDate.now();
        System.out.println("Lay nam hien tai: ");
        System.out.println(date1);
        System.out.println("Hien thi cho ca ngay va gio !");
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);
        System.out.println("Hien thi gio hien tai : ");
        LocalTime date3 = LocalTime.now();
        System.out.println(date3);



    }
}
