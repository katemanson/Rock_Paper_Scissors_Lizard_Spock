# Rock, Paper, Scissors (Lizard, Spock)

##Summary

This started out as a pair programming lab exercise from Week 7 of the immersive coding course at [CodeClan](https://codeclan.com/). I later refactored and extended it a bit; it's one of the first apps I made in Android Studio.

* The user can choose to play either Rock, Paper, Scissors or Rock, Paper, Scissors, Lizard, Spock against the app. (The Lizard, Spock version became well known after it was [Sheldon Coopered](https://www.youtube.com/watch?v=iSHPVCBsnLw), but apparently came about quite a while before that; the originator, Sam Kass, has a [page about it](http://www.samkass.com/theories/RPSSL.html).)
* The user chooses their weapon; so does the app. 
* Wins, losses and draws are counted. 

![emulator](https://github.com/katemanson/Rock_Paper_Scissors_Lizard_Spock/raw/master/img/emulator.png)

##Technical
* Java in Android Studio

##Highlights
* Apart from making the Lizard, Spock version... realising the core game logic could be simplified:
```
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
```

##Learning point
* The power of pair programming!

##Next steps

###Must...
* Iron out glitches (caused primarily by swapping between views)

###Should...
* Make it prettier

###Could...
* Make it two-player