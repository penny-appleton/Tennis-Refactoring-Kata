public abstract class NewScoreState {

    protected final ScoreContext context;

    public NewScoreState(ScoreContext context) {
        this.context = context;
    }

    public abstract void setScore(int player1Score, int player2Score);

    public abstract String getScore(int player1Score, int player2Score);
}
