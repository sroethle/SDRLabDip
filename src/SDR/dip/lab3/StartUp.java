package SDR.dip.lab3;

/**
 *
 * @author Scott Roethle
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        InputStrategy input = new GuiInputStrategy();
        InputStrategy input2 = new FileInputStrategy();
        OutputStrategy output = new GuiOutputStrategy();
        OutputStrategy output2 = new FileOutputStrategy();
        
        MessageService messageService = new MessageService(input2, output);
        
        messageService.displayoutputString(messageService.getInputString());
        
    }
    
}
