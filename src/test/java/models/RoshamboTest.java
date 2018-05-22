package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoshamboTest {

    @Test
    public void comparePlayers_returnsWinnerOfRockVSPaper_player2() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = "player2";
        assertEquals(expected, testRoshambo.comparePlayers("r", "p"));
    }

    @Test
    public void comparePlayers_returnsWinnerOfRockVSPaper_player1() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = "player1";
        assertEquals(expected, testRoshambo.comparePlayers("p", "r"));
    }

    @Test
    public void comparePlayers_returnsWinnerOfScissorsVSPaper_player1() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = "player1";
        assertEquals(expected, testRoshambo.comparePlayers("s", "p"));
    }

    @Test
    public void comparePlayers_returnsWinnerOfScissorsVSPaper_player2() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = "player2";
        assertEquals(expected, testRoshambo.comparePlayers("p", "s"));
    }

    @Test
    public void comparePlayers_returnsWinnerOfScissorsVSRock_player1() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = "player1";
        assertEquals(expected, testRoshambo.comparePlayers("r", "s"));
    }

    @Test
    public void comparePlayers_returnsWinnerOfScissorsVSRock_player2() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = "player2";
        assertEquals(expected, testRoshambo.comparePlayers("s", "r"));
    }

    @Test
    public void comparePlayers_returnsDrawForSameAnswer_Draw() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = "Draw";
        assertEquals(expected, testRoshambo.comparePlayers("r", "r"));
    }

    @Test
    public void getRandom_shouldBeAString_true() throws Exception {
        Roshambo testRoshambo = new Roshambo();
        String expected = testRoshambo.getRandom();
        assertEquals(true, expected instanceof String);
    }
}