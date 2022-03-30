package leisureCalculator;

public class Main {

    public static void main(String[] args) {

        //InputProcessing input = new InputProcessing();

        String act = "Sport";
        String we = "Sonne";
        String cost = "12";
        String activityNew = new LeisureCalculator(act, we, cost).calculateLeisure();
        System.out.println("Test mit variabler Stringübergabe " + activityNew);


        String activity = new LeisureCalculator("", "", "haallo").calculateLeisure();
        System.out.println(activity);
        String activity2 = new LeisureCalculator("Relax", "Sonne", "10").calculateLeisure();
        System.out.println(activity2);
    }

}
