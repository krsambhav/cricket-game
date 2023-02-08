import java.util.ArrayList;
import java.util.List;

public class team {

    String name;
    int runs = 0;
    int wickets = 0;

    List<player> playerList = new ArrayList<player>();

    void get_player_info() {
        for (int i = 0; i < 11; i++) {
            playerList.add(new player());
        }
    }

}
