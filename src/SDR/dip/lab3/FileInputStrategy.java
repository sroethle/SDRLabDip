package SDR.dip.lab3;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Scott Roethle
 */
public class FileInputStrategy implements InputStrategy  {
    
        public String getInput() {
            String message;
            
            try {
                File myFile = new File("inputFile.txt");
                Scanner inputFile = new Scanner(myFile);
                
                message = inputFile.nextLine();
                
            } catch (Exception e) {
               message = "Error";
            }
           
        return message;
    }
}
