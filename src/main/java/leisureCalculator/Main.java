package leisureCalculator;

public class Main {

    public static void main(String[] args) {

        //InputProcessing input = new InputProcessing();

        String activity = new LeisureCalculator("", "", "haallo").calculateLeisure();
        System.out.println(activity);
        String activity2 = new LeisureCalculator("Relax", "Sonne", "10").calculateLeisure();
        System.out.println(activity2);
    }

}
