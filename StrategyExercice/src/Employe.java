public class Employe {
    private String cin ;
    private float salaireBrutMensuel ;
    private Taux tauxIns ;
    public Employe(String cin , float salaireBrutMensuel){
        this.cin = cin ;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
    public Employe(){

    }
    public float calculerIGR(){
        float salaireBrutAnuel = salaireBrutMensuel*12;
        float taux =tauxIns.calculerTaux(salaireBrutAnuel);
        return salaireBrutAnuel*taux/100;
    }
    public float getSalaireNetMensuel(){
        float igr = calculerIGR();
        float salaireNetAnuel = salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }

    public void setTaux(Taux taux) {
        this.tauxIns = taux;
    }

    public String getCin() {
        return cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
}
