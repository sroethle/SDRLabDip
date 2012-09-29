package SDR.dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Scott Roethle
 */
public class GuiInputStrategy implements InputStrategy {

    private String displayMessage = "Please enter your input string.";
    

    public String getInput() {
        String message = JOptionPane.showInputDialog(null, displayMessage);
        return message;
    }
    
    
    
}
