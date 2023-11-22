import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TennisTest {

    TennisGame tennis;

//    @BeforeEach
//    void startGame(){
//        tennis = new TennisGame(0,0);
//    }

    @Test
    void getScoreStart(){
        tennis = new TennisGame(0,0);
        assertEquals("love - love",tennis.getScore());
    }
    @Test
    void getScoreFifteen(){
        tennis = new TennisGame(1,1);
        assertEquals("fifteen - fifteen",tennis.getScore());
    }

    @Test
    void getScoreThirty(){
        tennis = new TennisGame(2,1);
        assertEquals("thirty - fifteen",tennis.getScore());
    }

    @Test
    void getScoreForty(){
        tennis = new TennisGame(3,3);
        assertEquals("forty - forty",tennis.getScore());
    }

    @Test
    void getScoreDeuce(){
        tennis = new TennisGame(2,2);
        assertEquals("deuce - deuce",tennis.getScore());
    }


    @Test
    void testWinCondition(){
        tennis = new TennisGame(4,2);
        assertTrue(tennis.checkWinner(4));
        assertFalse(tennis.checkWinner(2));
        assertEquals("player one Wins" ,tennis.checkPointDifference());
        tennis = new TennisGame(2,4);
        assertEquals("player two Wins" ,tennis.checkPointDifference());

    }




}
