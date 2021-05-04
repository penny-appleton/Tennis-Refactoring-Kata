public class All implements ScoreState {

    private String score;

    public void setScore(int player1Score, int Player2Score) {
        if (player1Score == 0) {
            score = ScoreState.LOVE + "-All";
        } else if (player1Score == 1) {
            score = ScoreState.FIFTEEN + "-All";
        } else if (player1Score == 2) {
            score = ScoreState.THIRTY + "-All";
        } else
            score = "Deuce";
    }


    public String getScore() {
        return score;
    }

}
