package SDR.dip.lab3;
import javax.swing.JOptionPane;

/**
 *
 * @author Scott Roethle
 */
public class GuiOutputStrategy implements OutputStrategy {
    
    public void displayOutput(String outputMessage){
        JOptionPane.showMessageDialog(null,outputMessage);
    }
    
}
