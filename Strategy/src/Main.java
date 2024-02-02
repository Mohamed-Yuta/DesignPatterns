public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        context.setiStrategy(new IStrategyImpl1());
        context.appliquerStartegy();

        context.setiStrategy(new IStrategyImpl2());
        context.appliquerStartegy();

        context.setiStrategy(new IStrategyImpl3());
        context.appliquerStartegy();

    }
}