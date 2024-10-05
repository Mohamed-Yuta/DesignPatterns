import java.util.stream.Stream;

public class ObserverImpl2 implements Observer {
    private int state;
    private int sumOfStates;

    @Override
    public void update(int state) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        this.state = state;
        System.out.println("State updated in ObserverImpl2 to: " + state);
        System.out.println("do sum statistics with the state");
        sumOfStates += state;
        System.out.println("Sum of states in ObserverImpl2: " + sumOfStates);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

    public int getState() {
        return state;
    }

    public int getSumOfStates() {
        return sumOfStates;
    }
}
