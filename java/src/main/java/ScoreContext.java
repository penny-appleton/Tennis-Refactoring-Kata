public class ScoreContext {
    private int player1Score = 0;
    private int player2Score = 0;
    private ScoreState state;

    public void setScore(String player) {
        if (player.equals("Player1")) {
            player1Score++;
        } else player2Score++;

        state.setScore(player1Score, player2Score);

    }

    public void setState(ScoreState state) {
        this.state = state;
    }
}
