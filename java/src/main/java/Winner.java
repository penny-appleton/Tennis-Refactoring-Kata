public class Winner extends ScoreState {
    public Winner(ScoreContext context) {
        super(context);
    }

    @Override
    public void setScore(int player1Score, int player2Score) {

    }

    @Override
    public String getScore(int player1Score, int player2Score) {
        if(player1Score > player2Score) return "Win for player1";
        return "Win for player2";
    }
}
