public class ScoreContext {

    private NewScoreState state;
    protected int player1Score = 0;
    protected int player2Score = 0;

    public void setState(NewScoreState state) {
        this.state = state;
    }

    public void setScore(String playerWhoWonPoint) {
        if(playerWhoWonPoint.equals("player1")){
            player1Score += 1;
        } else player2Score +=1;

        state.setScore(player1Score, player2Score);
    }

    public String getScore() {
        return state.getScore(player1Score, player2Score);
    }
}
