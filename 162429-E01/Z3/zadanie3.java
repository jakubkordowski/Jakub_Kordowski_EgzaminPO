package pl.imiajd.kordowski;
import java.io.File;
import java.io.FileFilter;

public class zadanie3 {
    public static void main(String[] args){
        try{
            File tmp = new File("C:\\Users");
            String[] filter = tmp.list( (file, s) -> file.isDirectory() );
            for(String i:filter){
                System.out.println(i);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
