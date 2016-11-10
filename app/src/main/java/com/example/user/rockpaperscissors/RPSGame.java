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
            if (playerChoice == 0) { playerString = "rock"; }
            else if (playerChoice == 1) { playerString = "paper"; }
            else if (playerChoice == 2) { playerString = "scissors"; }

            String resultPlayerChoice = "You chose " + playerString + ".";

            Random randomThing = new Random();
            int randomChoice = randomThing.nextInt(3);

            String randomString = "";
            if (randomChoice == 0) { randomString = "rock"; }
            else if (randomChoice == 1) { randomString = "paper"; }
            else if (randomChoice == 2) { randomString = "scissors"; }

            String resultDraw = resultPlayerChoice + "\nI chose " + randomString + ". \nWe chose the same. \nIt's a draw.";
            String resultLose = resultPlayerChoice + "\nI chose " + randomString + ". \nYou lose!";
            String resultWin = resultPlayerChoice + "\nI chose " + randomString + ". \nYou win!";

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