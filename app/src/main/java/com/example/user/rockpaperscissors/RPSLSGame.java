package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class RPSLSGame {

    int mPlayerWinCount;
    int mPlayerLossCount;
    int mDrawCount;

    public RPSLSGame() {
        mPlayerWinCount = 0;
        mPlayerLossCount = 0;
        mDrawCount = 0;
    }

    public String play(int playerChoice){

        // 0 = rock, 1 = paper, 2 = scissors, 3 = lizard, 4 = Spock

        String playerString = "";
        if (playerChoice == 0) { playerString = "rock"; }
        else if (playerChoice == 1) { playerString = "paper"; }
        else if (playerChoice == 2) { playerString = "scissors"; }
        else if (playerChoice == 3) { playerString = "lizard"; }
        else if (playerChoice == 4) { playerString = "Spock"; }
        String resultPlayerChoice = "You chose " + playerString + ".";

        Random randomThing = new Random();
        int randomChoice = randomThing.nextInt(5);

        String randomString = "";
        if (randomChoice == 0) { randomString = "Rock"; }
        else if (randomChoice == 1) { randomString = "Paper"; }
        else if (randomChoice == 2) { randomString = "Scissors"; }
        else if (randomChoice == 3) { randomString = "Lizard"; }
        else if (randomChoice == 4) { randomString = "Spock"; }
        String resultRandomChoice = "\nI chose " + randomString + ".";

        String winReasoning = "";
        if (playerChoice == 0 && randomChoice == 1 ||
                playerChoice == 1 && randomChoice == 0) {
            winReasoning = "\nPaper covers Rock.";
        }
        else if (playerChoice == 0 && randomChoice == 2 ||
                playerChoice == 2 && randomChoice == 0) {
            winReasoning = "\nRock crushes Scissors.";
        }
        else if (playerChoice == 0 && randomChoice == 3 ||
                playerChoice == 3 && randomChoice == 0) {
            winReasoning = "\nRock crushes Lizard.";
        }
        else if (playerChoice == 0 && randomChoice == 4 ||
                playerChoice == 4 && randomChoice == 0) {
            winReasoning = "\nSpock vaporizes Rock.";
        }
        else if (playerChoice == 1 && randomChoice == 2 ||
                playerChoice == 2 && randomChoice == 1) {
            winReasoning = "\nScissors cuts Paper.";
        }
        else if (playerChoice == 1 && randomChoice == 3 ||
                playerChoice == 3 && randomChoice == 1) {
            winReasoning = "\nLizard eats Paper.";
        }
        else if (playerChoice == 1 && randomChoice == 4 ||
                playerChoice == 4 && randomChoice == 1) {
            winReasoning = "\nPaper disproves Spock.";
        }
        else if (playerChoice == 2 && randomChoice == 3 ||
                playerChoice == 3 && randomChoice == 2) {
            winReasoning = "\nScissors decapitates Lizard.";
        }
        else if (playerChoice == 2 && randomChoice == 4 ||
                playerChoice == 4 && randomChoice == 2) {
            winReasoning = "\nSpock smashes scissors.";
        }
        else if (playerChoice == 3 && randomChoice == 4 ||
                playerChoice == 4 && randomChoice == 3) {
            winReasoning = "\nLizard poisons Spock.";
        }

        String resultDraw = resultPlayerChoice + resultRandomChoice + "\n\nIt's a draw.";
        String resultLose = resultPlayerChoice + resultRandomChoice + winReasoning + "\n\nYou lose!";
        String resultWin = resultPlayerChoice + resultRandomChoice + winReasoning + "\n\nYou win!";

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

    public String getCountsText() {

        String winSingPlural;
        if (mPlayerWinCount == 1) { winSingPlural = "win"; }
        else { winSingPlural = "wins"; }

        String lossSingPlural;
        if (mPlayerLossCount == 1) { lossSingPlural = "win"; }
        else { lossSingPlural = "wins"; }

        String drawHasHave;
        if (mDrawCount == 1) { drawHasHave = "has"; }
        else { drawHasHave = "have"; }

        String drawSingPlural;
        if (mDrawCount == 1) { drawSingPlural = "draw"; }
        else { drawSingPlural = "draws"; }

        return "You have: " + mPlayerWinCount + " " + winSingPlural +
                "\nI have: " + mPlayerLossCount + " " + lossSingPlural +
                "\nThere " + drawHasHave + " been: " + mDrawCount + " " + drawSingPlural;
    }
}
