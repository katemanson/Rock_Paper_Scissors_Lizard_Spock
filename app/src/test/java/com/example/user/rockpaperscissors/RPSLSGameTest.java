package com.example.user.rockpaperscissors;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 09/11/2016.
 */

public class RPSLSGameTest {

    @Test
    public void testResultIsNotNull() {
        RPSLSGame game = new RPSLSGame();
        assertNotNull(game.play(0));
    }

}
