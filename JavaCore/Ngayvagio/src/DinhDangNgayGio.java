import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DinhDangNgayGio {
    public static void main(String[]args){
        LocalDateTime newDate =  LocalDateTime.now();
        DateTimeFormatter  formatt = DateTimeFormatter.ofPattern("yyyy");
        String dd = newDate.format(formatt);
        System.out.println(dd);
    }
}
