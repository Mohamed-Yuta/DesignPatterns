package adapter;

public class StandardImpl implements Standard {
    @Override
    public void operation(double nbr, double nbr2) {
        System.out.println("Standard Operation : " + nbr*nbr2);
    }
}
