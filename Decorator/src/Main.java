import composants.Boisson;
import composants.Espresso;
import decorateurs.Caramel;
import decorateurs.Chocolat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Boisson boisson ;
        boisson= new Espresso();
        System.out.println(boisson.getDescription());
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        // it's obligatory to complete the chain with a component(composant) and not a decorator.
        Boisson boisson1 = new Chocolat(new Caramel(new Espresso()));
        System.out.println(boisson1.getDescription());
    }
}