package adapter;

import ancienne.AncienneImpl;

public class AdapterImplem extends AncienneImpl implements Standard {
    @Override
    public void operation(double nbr, double nbr2) {
        double n = produit(nbr,nbr2);
        afficher(n);
    }
}
