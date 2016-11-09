package com.example.user.rockpaperscissors;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 09/11/2016.
 */

public class GameTest {

    @Test
    public void testResultIsNotNull() {
        RPSGame game = new RPSGame();
        assertNotNull(game.play(0));
    }

}
