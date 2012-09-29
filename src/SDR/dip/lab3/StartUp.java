package SDR.dip.lab3;

/**
 *
 * @author Scott Roethle
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        InputStrategy input = new GuiInputStrategy();
        OutputStrategy output = new GuiOutputStrategy();
        
        MessageService messageService = new MessageService(input, output);
        
        messageService.displayoutputString(messageService.getInputString());
        
    }
    
}
