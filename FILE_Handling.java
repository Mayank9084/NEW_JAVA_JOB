import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FILE_Handling {
    public static void main(String[] args) {

        // code to create new file
        /*
        File myFile = new File("Mayank_SINGH.txt");
        try{
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

         */

        // Code to write to a file
//        try{
//            FileWriter fileWriter = new FileWriter("Mayank_SINGH.txt");
//            fileWriter.write("This is my created first file by java ");
//            fileWriter.close();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        // Reading a file
//        File myFile = new File("Mayank_SINGH.txt");
//        try{
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        // Deleting a file
        File myFile = new File("Mayank_SINGH.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
