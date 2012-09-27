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
   
    public void setEmployee(TipCalculatorStrategy tip) {
        if (tip == null) {
            throw new NullPointerException();
        }
        tipCalculator = tip;
    }
    
    public double getTipCalculatorTip(){
        return tipCalculator.getTip();
    }
}
