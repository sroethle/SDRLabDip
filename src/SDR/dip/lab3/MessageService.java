package SDR.dip.lab3;

/**
 *
 * @author Scott Roethle
 */

public class MessageService {
    
    private InputStrategy input;
    private OutputStrategy output;
    
    public MessageService(){
        
    }
    
    public MessageService(InputStrategy input, OutputStrategy output){
        this.input = input;
        this.output = output;
    }

    public void setInputStrategy(InputStrategy input) {
        this.input = input;
    }

    public void setOutputStrategy(OutputStrategy output) {
        this.output = output;
    }
    
    public String getInputString(){
        return input.getInput();
    }
    
    public void displayoutputString(String outputString){
        output.displayOutput(outputString);        
    }
}
