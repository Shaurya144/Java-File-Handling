import java.io.File; // Objects / Classes
import java.io.FileWriter;
import java.util.Scanner;

import java.io.IOException; // Handle errors
import java.io.FileNotFoundException;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // To Create new File
        File myObj = new File("filename.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // To Write to a File
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("This is nice. ");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        // SO you create a writer Object that does the writing
        // then you tell it which file and what to write
        // then you close the file

        // To Read Files
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // SO Now you create a Reader and give it the File Object
        // Then you create a while loop where as long as there is a "next line" the
        // Reader .. reads
        // and Prints

        // To Read File Info

        if (myObj.exists()) {

            System.out.println("File name: " + myObj.getName()); // Name
            System.out.println("Absolute path: " + myObj.getAbsolutePath()); // File Directory / Path
            System.out.println("Writeable: " + myObj.canWrite()); // Is it Editable?
            System.out.println("Readable " + myObj.canRead()); // Can you read the data inside?
            System.out.println("File size in bytes " + myObj.length()); // How big is the file?

            // Outputs for canWrite and canRead will be booleans

        } else {
            System.out.println("The file does not exist.");
        }

        // To Delete Files
        myObj.delete();
    }
}