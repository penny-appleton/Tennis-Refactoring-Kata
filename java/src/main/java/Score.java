public class Score {
    private ScoreState state = new All();
    private String score;

    public ScoreState getState(){
        return state;
    }

    public String getScore() {
        return score;
    }

    public void setScore(ScoreState state, int scorePlayer1, int scorePlayer2) {
        this.state = state;
        state.setScore(scorePlayer1, scorePlayer2);
        score = state.getScore();
    }
}
