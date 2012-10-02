package SDR.dip.lab3;

/**
 *
 * @author Scott Roethle
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        InputStrategy input = new GuiInputStrategy();
        InputStrategy input2 = new FileInputMessageStrategy();
        OutputStrategy output = new GuiOutputStrategy();
        OutputStrategy output2 = new FileOutputMessageStrategy();
        
        MessageService messageService = new MessageService(input, output);
        
        messageService.outputMessage();
        
    }
    
}
