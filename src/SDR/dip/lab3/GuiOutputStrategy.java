package SDR.dip.lab3;
import javax.swing.JOptionPane;

/**
 *
 * @author Scott Roethle
 */
public class GuiOutputStrategy implements OutputStrategy {
    
    @Override
    public final void outputMessage(MessageStrategy message){
        
        JOptionPane.showMessageDialog(null,message.getMessage());
    }
    
}
