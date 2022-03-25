package leisureCalculator;

import java.util.Random;

public class LeisureCalculator {

    String activityType;
    String weather;
    String cost;
    String activity = "";
    Integer costCalculate;
    MatrixBuilder matrix;


    public LeisureCalculator( String activityType, String weather, String cost ){

        this.activityType = activityType;
        this.weather = weather;
        this.cost= cost;
        matrix = new MatrixBuilder();

    }


    public String calculateLeisure() {

        int weatherIndex = 4;
        int activityIndex = 4;
        int costIndex = 4;


        activity = "Fehler, leider können wir dir für deine Bedürfnisse keine Vorschläge machen :(";

        if (activityType.isEmpty() && weather.isEmpty() && cost.isEmpty()){
            return "Komm gib dir Mühe!";
        }

        if (!cost.isEmpty()) {
            try {
                this.costCalculate = Integer.parseInt(cost);
           }catch (NumberFormatException e) {
                return "Sorry Bro, viel Glück beim nächsten Mal";
            }
        } else {
            costCalculate = 0;
        }

        if (costCalculate >= 0 && costCalculate < 10 ) {
            costIndex = 0;
        }else if (costCalculate >= 10 && costCalculate < 20) {
            costIndex = 1;
        }else if (costCalculate >= 20 && costCalculate < 100){
            costIndex = 2;
        }else if (costCalculate >= 100) {
            costIndex = 3;
        }

        if (activityType.isEmpty()) {
            Random rand = new Random();
            activityIndex = rand.nextInt(2);
        } else if (activityType == "Relax") {
            activityIndex = 0;
        } else if (activityType == "Sport") {
            activityIndex = 1;
        } else if (activityType == "Entertainment"){
            activityIndex = 2;
        }

        if (weather.isEmpty()) {
            Random rand = new Random();
            weatherIndex = rand.nextInt(2);
        } else if (weather == "Sonne") {
            weatherIndex = 0;
        } else if (weather == "Regen") {
            weatherIndex = 1;
        } else if (weather == "Schnee"){
            weatherIndex = 2;
        }
        if (weatherIndex == 4 || costIndex == 4 || activityIndex == 4) {
            return activity;
        }
        return matrix.getActivity(weatherIndex, activityIndex, costIndex);
    }
}
