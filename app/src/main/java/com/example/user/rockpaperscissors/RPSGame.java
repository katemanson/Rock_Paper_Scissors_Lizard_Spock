package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class RPSGame {

    int mPlayerWinCount;
    int mPlayerLossCount;
    int mDrawCount;

    public RPSGame() {
        mPlayerWinCount = 0;
        mPlayerLossCount = 0;
        mDrawCount = 0;
    }

        public String play(int playerChoice){

            // 0 = rock, 1 = paper, 2 = scissors

            String playerString = "";
            if (playerChoice == 0) { playerString = "Rock"; }
            else if (playerChoice == 1) { playerString = "Paper"; }
            else if (playerChoice == 2) { playerString = "Scissors"; }
            String resultPlayerChoice = "You chose " + playerString + ".";

            Random randomThing = new Random();
            int randomChoice = randomThing.nextInt(3);

            String randomString = "";
            if (randomChoice == 0) { randomString = "Rock"; }
            else if (randomChoice == 1) { randomString = "Paper"; }
            else if (randomChoice == 2) { randomString = "Scissors"; }
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
            else if (playerChoice == 1 && randomChoice == 2 ||
                    playerChoice == 2 && randomChoice == 1) {
                    winReasoning = "\nScissors cuts Paper.";
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
                    playerChoice == 1 && randomChoice == 2 ||
                    playerChoice == 2 && randomChoice == 0) {

                result = resultLose;
                mPlayerLossCount++;
            }
            else if (playerChoice == 0 && randomChoice == 2 ||
                    playerChoice == 1 && randomChoice == 0 ||
                    playerChoice == 2 && randomChoice == 1) {

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