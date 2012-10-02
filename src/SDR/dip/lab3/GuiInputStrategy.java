package SDR.dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Scott Roethle
 */
public class GuiInputStrategy implements InputStrategy {
    MessageStrategy message = new StringMessageStrategy();

    private String displayMessage = "Please enter your input string.";
    

    @Override
    public final MessageStrategy getInput() {
        message.setMessage(JOptionPane.showInputDialog(null, displayMessage));
       
        return message;
    }
}
