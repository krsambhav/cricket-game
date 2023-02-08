import java.util.Scanner;


public class match_controller {      // this class is responsible for accepting teams and doing toss


    Scanner sc = new Scanner(System.in);

    void get_teams(team team1, team team2) {


        System.out.println("Enter Your Team Name: ");
        team1.name = sc.nextLine();
        System.out.println("Enter Your Opponent's Team Name");
        team2.name = sc.nextLine();
    }

    void do_toss(team team1, team team2) {
        score_calculator score_obj = new score_calculator();
        System.out.println("Heads or Tails (Enter 0 For Heads, 1 For Tails)");
        int choice = sc.nextInt();
        double d = Math.random();
        if (d >= 0.5) {
            d = 1;
        } else {
            d = 0;
        }
        if (d == choice) {
            System.out.println("Yay, You Won The Toss!");
            System.out.println("Enter Bat or Ball:");
            String choose = sc.next();
            if (choose.equals("bat")) {
                score_obj.calculate(team1);
                System.out.println("Now, " + team2.name + " Will Bat");
                score_obj.calculate(team2);
            } else {
                score_obj.calculate(team2);
                System.out.println("Now, " + team1.name + " Will Bat");
                score_obj.calculate(team1);
            }
        } else {
            System.out.println("You Lost The Toss :(, " + team2.name + " Will Bat First");
            score_obj.calculate(team2);
            System.out.println("Now, " + team1.name + " Will Bat");
            score_obj.calculate(team1);
        }
        if (team1.runs > team2.runs) {
            System.out.println(
                    team1.name + " Scored " + team1.runs + " While " + team2.name + " Scored " + team2.runs + ". ");
            System.out.println(team1.name + " Wins");
        } else if (team1.runs < team2.runs) {
            System.out.println(
                    team1.name + " Scored " + team1.runs + " While " + team2.name + " Scored " + team2.runs + ". ");
            System.out.println(team2.name + " Wins");
        } else {
            System.out.println("The Match Is Tied");
        }

    }
}