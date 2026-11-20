package com.plurasight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighscoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game score: ");
        String result = scanner.nextLine();

        String[] teamResult = result.split(Pattern.quote("|"));
        String[] teamNames = teamResult[0].split(Pattern.quote(":"));
        String[] scores = teamResult[1].split(Pattern.quote(":"));
        int teamsScore1= Integer.parseInt(scores[0]);
        int teamsScoer2 = Integer.parseInt(scores[1]);

        if(teamsScore1 > teamsScoer2){
            System.out.println("Winner: "+teamNames[0]);
        } else if (teamsScoer2 > teamsScore1) {
            System.out.println("Winner: "+teamNames[1]);
        } else if (teamsScore1 == teamsScoer2) {
            System.out.println("Winner: Tie!");
        }


    }
}
