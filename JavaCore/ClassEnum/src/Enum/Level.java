package Enum;

public enum Level {
    //An enumlà một "lớp" đặc biệt đại diện cho một nhóm
    //các hằng số (các biến không thể thay đổi, như finalcác biến)
    //Để tạo một enum, hãy sử dụng enum từ khóa (thay vì lớp hoặc
    //giao diện) và phân tách các hằng số bằng dấu phẩy. Lưu ý
    //rằng chúng phải được viết hoa:
    DEVTRINH,
    LOW,
    MEDIUM,
    HIGHT,
    MANH
    //Sự khác biệt giữa Enums và Class
    //Một enumcan, giống như a class,
    // có các thuộc tính và phương thức.
    // Sự khác biệt duy nhất là hằng số enum
    // là public, staticvà final (không thể thay đổi - không thể bị ghi đè).
    //
    //An enumkhông thể được sử dụng để tạo các
    //đối tượng và nó không thể mở rộng các lớp
    //khác (nhưng nó có thể triển khai các giao diện).
    //
    //Tại sao và khi nào sử dụng Enums?
    //Sử dụng enum khi bạn có các giá trị mà bạn biết
    // là sẽ không thay đổi, chẳng hạn như ngày tháng, ngày tháng, màu sắc, bộ bài, v.v.
}
