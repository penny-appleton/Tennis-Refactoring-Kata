public class ScoreContext {

    private int player1Score = 0;
    private int player2Score = 0;
    private ScoreState state;

    public void setScore(String player) {
        if (player.equals("player1")) {
            player1Score+=1;
        } else player2Score+=1;

        state.setScore(player1Score, player2Score);

    }

    public void setState(ScoreState state) {
        this.state = state;
    }

    public String getScore() {
        return state.getScore(player1Score, player2Score);
    }
}
