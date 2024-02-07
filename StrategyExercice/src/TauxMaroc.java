public class TauxMaroc implements Taux {
    @Override
    public float calculerTaux(float salaireBrutAnuel) {
        float taux =0 ;

        if (salaireBrutAnuel<40000){
            taux=5;
        } else if (salaireBrutAnuel>40000 && salaireBrutAnuel<120000){
            taux =20;
        }
        else {
            taux=42 ;
        }
        return taux ;
    }
}
