package decorateurs;
import composants.Boisson;

public abstract class Decorateur extends Boisson {
    protected Boisson boisson ;

    public Decorateur(Boisson boisson){
        this.boisson = boisson ;
    }

}
