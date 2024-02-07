import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        Employe employe=new Employe();
        System.out.println("Entrez cin :");
        employe.setCin(scanner.nextLine());
        System.out.println("Entrez Salaire mensuel :");
        employe.setSalaireBrutMensuel(scanner.nextFloat());
        Taux taux;
        while(true){
            System.out.println("Entrez Pays :");
            scanner.nextLine();
            String pays=scanner.nextLine();
            System.out.println(pays);
            taux=(Taux) Class.forName("Taux"+pays).getConstructor().newInstance();
            employe.setTaux(taux);
            System.out.println("Le salaire net mensuel est : "+employe.getSalaireNetMensuel());
        }
    }
}