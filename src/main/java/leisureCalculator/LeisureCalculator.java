package leisureCalculator;

public class LeisureCalculator {

    String activityType;
    String weather;
    String cost;
    String activity = "";

    protected LeisureCalculator( String activityType, String weather, String cost ){

        this.activityType = activityType;
        this.weather = weather;
        this.cost = cost;
    }


    public String calculateLeisure() {

        activity = "Fehler, leider können wir dir für deine Bedürfnisse keine Vorschläge machen :(";

        if (activityType.isBlank() && weather.isBlank() && cost.isBlank()){
            return "Komm gib dir Mühe!";
        }
        //if (activityType = )
        return activity;
    }
}
