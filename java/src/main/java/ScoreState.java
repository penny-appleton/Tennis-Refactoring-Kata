public interface ScoreState {
    String LOVE = "Love";
    String FIFTEEN = "Fifteen";
    String THIRTY = "Thirty";
    String FORTY = "Forty";

    void setScore(int player1Score, int player2Score);
    String getScore();

}
