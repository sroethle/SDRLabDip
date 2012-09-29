package SDR.dip.lab3;

import java.io.PrintWriter;

/**
 *
 * @author Scott Roethle
 */
public class FileOutputStrategy implements OutputStrategy {
    
        public void displayOutput(String outputMessage){
            
            try {
                String fileName = "inputFile.txt";
                PrintWriter outputFile = new PrintWriter(fileName);

                outputFile.println(outputMessage);
                outputFile.close();

            } catch (Exception e) {
                
            }    
    } 
}
