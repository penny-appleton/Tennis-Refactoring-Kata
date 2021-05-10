public abstract class ScoreState {
    protected static final String LOVE = "Love";
    protected static final String FIFTEEN = "Fifteen";
    protected static final String THIRTY = "Thirty";
    protected static final String FORTY = "Forty";
    protected final ScoreContext context;

    public ScoreState(ScoreContext context) {
        this.context = context;
    }

    public abstract void setScore(int player1Score, int player2Score);

    public abstract String getScore(int player1Score, int player2Score);
}
