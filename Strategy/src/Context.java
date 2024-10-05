
public class Context {

    private IStrategy strategy;
    public void applyStartegy(){
        strategy.apply();
    }

    public void setStrategy(IStrategy strategy){
        this.strategy =strategy ;
    }
}