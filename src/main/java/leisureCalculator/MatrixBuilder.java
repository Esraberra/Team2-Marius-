package leisureCalculator;


public class MatrixBuilder {

    String[][][] tmpActivity;

    public MatrixBuilder(){

        this.tmpActivity = new String[3][3][4];

        // sonnig relax
        tmpActivity[0][0][0] = "Picknick";
        tmpActivity[0][0][1] = "Biergarten";
        tmpActivity[0][0][2] = "Biergarten 2.0";
        tmpActivity[0][0][3] = "Besuch 5 Sterne Restaurant";

        //sonnig sportlich
        tmpActivity[0][1][0] = "Wandern";
        tmpActivity[0][1][1] = "Outdoorklettern";
        tmpActivity[0][1][2] = "Golf spielen";
        tmpActivity[0][1][3] = "Segeln";

        //sonnig entertainment
        tmpActivity[0][2][0] = "Sterne gucken";
        tmpActivity[0][2][1] = "Autokino";
        tmpActivity[0][2][2] = "Konzert gehen";
        tmpActivity[0][2][3] = "Ballet";

        //regen relax
        tmpActivity[1][0][0] = "Netflix";
        tmpActivity[1][0][1] = "Netflix und Lieferando";
        tmpActivity[1][0][2] = "Picknicken";
        tmpActivity[1][0][3] = "Picknicken";

        //regen sport
        tmpActivity[1][1][0] = "Liegestütz";
        tmpActivity[1][1][1] = "Hallenbad";
        tmpActivity[1][1][2] = "GoKart";
        tmpActivity[1][1][3] = "Sorry keine Idee";

        //regen entertainment
        tmpActivity[1][2][0] = "Twitch";
        tmpActivity[1][2][1] = "Kino";
        tmpActivity[1][2][2] = "Theater";
        tmpActivity[1][2][3] = "Picknicken";

        //schnee relax
        tmpActivity[2][0][0] = "Schneemann bauen";
        tmpActivity[2][0][1] = "Glühwein trinken";
        tmpActivity[2][0][2] = "Konzert gehen";
        tmpActivity[2][0][3] = "Besuch 5 Sterne Restaurant";

        //schnee sportlich
        tmpActivity[2][1][0] = "Rodeln";
        tmpActivity[2][1][1] = "Biergarten";
        tmpActivity[2][1][2] = "Konzert gehen";
        tmpActivity[2][1][3] = "Skifahren";

        //schnee entertainment
        tmpActivity[2][2][0] = "Twitch";
        tmpActivity[2][2][1] = "Kino";
        tmpActivity[2][2][2] = "Theater";
        tmpActivity[2][2][3] = "Sorry keine Idee";


    }


    public String getActivity(int weather, int activity, int cost) {
        return tmpActivity[weather][activity][cost];
    }
}


