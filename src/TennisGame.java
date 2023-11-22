public class TennisGame {

    int playerOne, playerTwo;

    public TennisGame(int playerOne, int playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        System.out.println(getScore());
    }


    public String getScore() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            int score = i == 0 ? playerOne : playerTwo;
            if (i == 1) result.append(" - ");
            switch (score) {
                case 0 -> result.append("love");
                case 1 -> result.append("fifteen");
                case 2 -> result.append("thirty");
                case 3 -> result.append("forty");
            }
        }
        return playerOne == 2 && playerTwo == 2 ? "deuce - deuce" : result.toString();
    }


    public String checkPointDifference() {
        if (playerOne - playerTwo == 2 && checkWinner(playerOne)) return "player one Wins";
        else if (playerTwo - playerOne == 2 && checkWinner(playerTwo)) return "player two Wins";
        return "null";
    }

    public boolean checkWinner(int score) {
        return score >= 4;
    }


}
