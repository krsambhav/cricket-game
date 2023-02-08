public class score_calculator {


    void calculate(team t) {
        int player_number = 0, balls = 0;
        BallPredictor predictor_obj = new BallPredictor();
        t.get_player_info();

        display_result display_obj = new display_result();
        while ((player_number < 10) && (balls < 120)) {
            int get_prediction = predictor_obj.prediction();
            // System.out.println(get_prediction);
            if (get_prediction < 7) {
                t.playerList.get(player_number).runs += get_prediction;
                t.runs += get_prediction;
                balls++;
                display_obj.display_delivery_result(player_number, t.playerList.get(player_number).runs, t.wickets,
                        balls);

            } else if (get_prediction == 7) {
                t.playerList.get(player_number).is_out = true;
                t.wickets++;
                balls++;
                display_obj.display_delivery_result(player_number, t.playerList.get(player_number).runs, t.wickets,
                        balls);
                player_number++;

            }


        }
    }
}
