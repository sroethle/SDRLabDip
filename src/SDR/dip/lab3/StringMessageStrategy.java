package SDR.dip.lab3;

/**
 *
 * @author Scott Roethle
 */
public class StringMessageStrategy implements MessageStrategy {
    private String message;
    
    @Override
    public void setMessage(String message){
        this.message = message;
    }   
    
    @Override
    public String getMessage(){
        return this.message;
    }   
}
