package SDR.dip.lab3;

/**
 *
 * @author sroethle
 */
public interface MessageStrategy {
    
    public abstract void setMessage(String message);    
    
    public abstract String getMessage();
}
