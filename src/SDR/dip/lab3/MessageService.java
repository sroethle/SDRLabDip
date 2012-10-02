package SDR.dip.lab3;

/**
 *
 * @author Scott Roethle
 */

public class MessageService {
    
    private InputStrategy input;
    private OutputStrategy output;
    
    public MessageService(InputStrategy input, OutputStrategy output){
        this.input = input;
        this.output = output;
    }
    public final MessageStrategy inputMessage(){
        return input.getInput();
    }
    
    public final void outputMessage(){
        output.outputMessage(input.getInput());       
    }
}
