package SDR.dip.lab2;

/**
 *
 * @author sroethle
 */
public class TipCalculatorService {
    private TipCalculatorStrategy tipCalculator;
    
    public TipCalculatorService(TipCalculatorStrategy tipCalculator){
        this.tipCalculator = tipCalculator;
    }
      
    public double getTip(){
        return tipCalculator.getTip();
    }
}
