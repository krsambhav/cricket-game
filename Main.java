import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        match_controller controller = new match_controller();
        team team1 = new team();
        team team2 = new team();
        controller.get_teams(team1, team2);
        controller.do_toss(team1, team2);
    }
}