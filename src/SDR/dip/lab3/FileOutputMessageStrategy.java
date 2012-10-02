package SDR.dip.lab3;

import java.io.PrintWriter;

/**
 *
 * @author Scott Roethle
 */
public class FileOutputMessageStrategy implements OutputStrategy {
    
    @Override
        public final void outputMessage(MessageStrategy message){
            
            try {
                String fileName = "inputFile.txt";
                PrintWriter outputFile = new PrintWriter(fileName);

                outputFile.println(message.getMessage());
                outputFile.close();

            } catch (Exception e) {
                
            }    
    } 
}
