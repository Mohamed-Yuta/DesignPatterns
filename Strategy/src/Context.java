public class Context {
    private IStrategy iStrategy ;
    public void appliquerStartegy(){
        iStrategy.appliquer();
    }
    public void setiStrategy(IStrategy strategy){
        this.iStrategy=strategy ;
    }
}
