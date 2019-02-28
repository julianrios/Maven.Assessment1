package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if(ROCK.equals(handSign)) {
            return PAPER;
        } else if(PAPER.equals(handSign)) {
            return SCISSOR;
        } else {
            return ROCK;
        }
//
//
//        String winningMove = "";
//        switch (handSign) {
//            case "rock":
//                winningMove  = "paper";
//                break;
//
//            case "paper":
//                winningMove  = "scissor";
//                break;
//
//            case "scissor":
//                winningMove  = "rock";
//                break;
//        }
//        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if(ROCK.equals(handSign)) {
            return SCISSOR;
        } else if(PAPER.equals(handSign)) {
            return ROCK;
        } else {
            return PAPER;
        }

//        String losingMove = "";
//        switch (handSign) {
//            case "rock":
//                losingMove  = "scissor";
//                break;
//
//            case "paper":
//                losingMove  = "rock";
//                break;
//
//            case "scissors":
//                losingMove  = "paper";
//                break;
//        }
//        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if(getLosingMove(handSignOfPlayer1).equals(handSignOfPlayer2)) {
            winner = getWinningMove(handSignOfPlayer2);
        } else {
            winner = getWinningMove(handSignOfPlayer1);
        }
        return winner;
    }
}
