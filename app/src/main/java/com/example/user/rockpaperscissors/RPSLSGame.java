package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class RPSLSGame {

    int mPlayerWinCount = 0;
    int mPlayerLossCount = 0;
    int mDrawCount = 0;

    public String play(int playerChoice){

        // 0 = rock, 1 = paper, 2 = scissors, 3 = lizard, 4 = Spock

        Random randomThing = new Random();
        int randomChoice = randomThing.nextInt(5);

        String randomString = "";
        if (randomChoice == 0) { randomString = "rock"; }
        else if (randomChoice == 1) { randomString = "paper"; }
        else if (randomChoice == 2) { randomString = "scissors"; }
        else if (randomChoice == 3) { randomString = "lizard"; }
        else if (randomChoice == 4) { randomString = "Spock"; }

        String resultDraw = "I chose " + randomString + ". \nYou chose the same. \nIt's a draw.";
        String resultLose = "I chose " + randomString + ". \nYou lose!";
        String resultWin = "I chose " + randomString + ". \nYou win!";

        String result = "";
        if (playerChoice == randomChoice) {

            result = resultDraw;
            mDrawCount++;
        }
        else if (playerChoice == 0 && randomChoice == 1 ||
                playerChoice == 0 && randomChoice == 4 ||
                playerChoice == 1 && randomChoice == 2 ||
                playerChoice == 1 && randomChoice == 3 ||
                playerChoice == 2 && randomChoice == 0 ||
                playerChoice == 2 && randomChoice == 4 ||
                playerChoice == 3 && randomChoice == 0 ||
                playerChoice == 3 && randomChoice == 2 ||
                playerChoice == 4 && randomChoice == 1 ||
                playerChoice == 4 && randomChoice == 3 ) {

            result = resultLose;
            mPlayerLossCount++;
        }
        else if (playerChoice == 0 && randomChoice == 2 ||
                playerChoice == 0 && randomChoice == 3 ||
                playerChoice == 1 && randomChoice == 0 ||
                playerChoice == 1 && randomChoice == 4 ||
                playerChoice == 2 && randomChoice == 1 ||
                playerChoice == 2 && randomChoice == 3 ||
                playerChoice == 3 && randomChoice == 1 ||
                playerChoice == 3 && randomChoice == 4 ||
                playerChoice == 4 && randomChoice == 0 ||
                playerChoice == 4 && randomChoice == 2 ) {

            result = resultWin;
            mPlayerWinCount++;
        }
        return result;
    }

    public int getPlayerWinCount() {
        return mPlayerWinCount;
    }

    public int getPlayerLossCount() {
        return mPlayerLossCount;
    }

    public int getDrawCount() {
        return mDrawCount;
    }

    public String getCountsText (){
        return "So far, you have " + mPlayerWinCount + " wins, " +
                "\nI have " + mPlayerLossCount + " ," +
                "\nand there have been " + mDrawCount + " draws";
    }
}
