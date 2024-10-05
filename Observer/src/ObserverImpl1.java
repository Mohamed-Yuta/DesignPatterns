public class ObserverImpl1 implements Observer {
    private int state;

    @Override
    public void update(int state) {
        System.out.println("----------------------------------------");
        this.state = state;
        System.out.println("State updated in ObserverImpl1 to: " + state);
        System.out.println("----------------------------------------");
    }

    public int getState() {
        return state;
    }
}
