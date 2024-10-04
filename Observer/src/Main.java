import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        List<Integer> states = Arrays.asList(1, 2, 3, 4, 5);
        for (int state : states) {
            observable.setState(state);
        }

        System.out.println("State in ObserverImpl1: " + ((ObserverImpl1) observer1).getState());
        System.out.println("State in ObserverImpl2: " + ((ObserverImpl2) observer2).getState());
        System.out.println("Sum of states in ObserverImpl2: " + ((ObserverImpl2) observer2).getSumOfStates());

    }
}