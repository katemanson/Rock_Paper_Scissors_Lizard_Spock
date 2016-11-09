package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {


    public Game() {

    private String getComputerChoice() {
        String[] choices = {"rock", "scizzors", "paper"};
        ArrayList<String> choicesArrayList = new ArrayList(Arrays.asList(choices));

        Random random = new Random();
        int randomChoice = random.nextInt(3);
        String computerChoice = choicesArrayList.get(randomChoice);
        return computerChoice;
    }

    public String play(String playerChoice) {
        
    }

}
