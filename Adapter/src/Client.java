import adapter.Standard;

public class Client {

    private Standard standard ;

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public void traitement(double a , double b){
        System.out.println("bla bla bla bla ");
        System.out.println("*****************");
        standard.operation(a,b);
    }
}
