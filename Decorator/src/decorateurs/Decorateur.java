package decorateurs;
import composants.Boisson;

public abstract class Decorateur extends Boisson {
    protected Boisson boisson;

    public Decorateur(Boisson boisson){
        this.boisson = boisson ;
    }

    /*
    why we need a instance of the boisson if the decorators already extends
    from the boisson ? why not using super ? or it has a problem when we have
    multiple decorator ?
     */
    // make the get description method abstract to force the subclasses to implement it
    @Override
    public abstract String getDescription();

}
