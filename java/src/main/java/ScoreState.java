public abstract class ScoreState {
    protected final ScoreContext context;

    public ScoreState(ScoreContext context) {
        this.context = context;
    }

    public abstract void setScore(int player1Score, int player2Score);
}
