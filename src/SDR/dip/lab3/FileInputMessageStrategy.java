package SDR.dip.lab3;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Scott Roethle
 */
public class FileInputMessageStrategy implements InputStrategy  {
    MessageStrategy message = new StringMessageStrategy();

    @Override
    public final MessageStrategy getInput() {

        try {
            File myFile = new File("inputFile.txt");
            Scanner inputFile = new Scanner(myFile);

            message.setMessage(inputFile.nextLine());

        } catch (Exception e) {
            message.setMessage("error");
        }

        return message;
    }
}
