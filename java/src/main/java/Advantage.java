public class Advantage implements ScoreState {

    private String score;

    public void setScore(int player1Score, int player2Score) {
        if (player1Score - player2Score == 1) score = "Advantage player1";
        else if (player1Score - player2Score == -1) score = "Advantage player2";
        else if (player1Score - player2Score >= 2) score = "Win for player1";
        else score = "Win for player2";
    }

    @Override
    public String getScore() {
        return score;
    }

}
