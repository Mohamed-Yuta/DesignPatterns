package decorateurs;

import composants.Boisson;

public class Caramel extends Decorateur {
    public Caramel(Boisson boisson){
        super(boisson);
    }
    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }

    @Override
    public String getDescription() {
        return  super.getDescription() + "Au Caramel";
    }
}
