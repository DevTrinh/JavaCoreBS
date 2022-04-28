import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class createNewFile {
    public static void main(String[]args){
        try{
            System.out.println("Tao mot file moi");
            File newfile = new File("F:\\ManhLapTrinh\\Java\\File\\src\\newFile.txt");
            newfile.createNewFile();
            FileWriter writerFile = new FileWriter("F:\\ManhLapTrinh\\Java\\File\\src\\newFile.txt");
            writerFile.write("file viet duoc luu vao day !");
            writerFile.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
