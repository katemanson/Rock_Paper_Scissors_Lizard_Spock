package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class RPSGame {

        int mPlayerWinCount = 0;
        int mPlayerLossCount = 0;
        int mDrawCount = 0;

        public String play(int playerChoice){

            // 0 = rock, 1 = paper, 2 = scissors

            Random randomThing = new Random();
            int randomChoice = randomThing.nextInt(3);

            String randomString = "";
            if (randomChoice == 0) { randomString = "rock"; }
            else if (randomChoice == 1) { randomString = "paper"; }
            else if (randomChoice == 2) { randomString = "scissors"; }

            String resultDraw = "I chose " + randomString + ". \nYou chose the same. \nIt's a draw.";
            String resultLose = "I chose " + randomString + ". \nYou lose!";
            String resultWin = "I chose " + randomString + ". \nYou win!";

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
