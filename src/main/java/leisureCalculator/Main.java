package leisureCalculator;

public class Main {

    public static void main(String[] args) {

        //InputProcessing input = new InputProcessing();

        String activity = new LeisureCalculator("", "warm sonnig", "10-20").calculateLeisure();
        System.out.println(activity);
    }

}
