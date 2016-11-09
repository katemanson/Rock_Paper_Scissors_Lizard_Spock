package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {


        public String play(int playerChoice){

            // 0 = rock, 1 = paper, 2 = scissors

            Random random = new Random();
            int randomChoice = random.nextInt(3);
            String result = "";

            String resultDraw = "You chose the same. Draw!";
            String resultLose = "You lose!";
            String resultWin = "You win!";

            if (playerChoice == randomChoice) {
                result = resultDraw;
            }
            else if (playerChoice == 0 && randomChoice == 1 ||
                    playerChoice == 1 && randomChoice == 2 ||
                    playerChoice == 2 && randomChoice == 0) {
                result = resultLose;
            }
            else if (playerChoice == 0 && randomChoice == 2 ||
                    playerChoice == 1 && randomChoice == 0 ||
                    playerChoice == 2 && randomChoice == 1) {
                result = resultWin;
            }
            return result;

        }

    }
