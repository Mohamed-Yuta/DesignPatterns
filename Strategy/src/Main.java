public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        context.setStrategy(new StrategyImpl1());
        context.applyStartegy();

        context.setStrategy(new StrategyImpl2());
        context.applyStartegy();

        context.setStrategy(new StrategyImpl3());
        context.applyStartegy();
    }
}