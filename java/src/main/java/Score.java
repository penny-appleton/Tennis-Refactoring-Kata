public interface Score {
    String LOVE = "Love";
    String FIFTEEN = "Fifteen";
    String THIRTY = "Thirty";
    String FORTY = "Forty";

    String setScore(int scoreIncrement);

    String getState();
}
