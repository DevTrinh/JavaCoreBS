package File;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class DemoFile {
    public static void writeFile(){
        try {
            FileWriter newWrite = new FileWriter("java1.txt");
            //Khởi tạo đối tượng newWrite để viết file
            newWrite.write("trinh van manh 10102002");
            //viết vào file
            newWrite.close();
            //đóng file
            System.out.println("complete write file !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        try{
            File myObj = new File("java1.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }
            else{
                System.out.println("File da ton tai");
            }
            Scanner scFile = new Scanner(myObj);
            while(scFile.hasNextLine() == true){
                System.out.println(scFile);
                scFile.close();
            }
        }
        catch(IOException e){
            System.out.println("An error");
            e.printStackTrace();
        }
        //writeFile();

    }
}
