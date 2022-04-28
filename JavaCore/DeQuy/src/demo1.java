public class demo1 {
    public static int i = 0;
    public static void dequygoiten(){
        if(i == 10){
            return ;
        }
        System.out.println("Xin chao trinh van manh "+i);
        i++;
        dequygoiten();

    }
    public static void main(String []args){
        System.out.println("_____CAU TRUC DE QUY_____");
        System.out.println("goi ham de quy: ");
        System.out.println("Trinh !");
        dequygoiten();
    }
}
