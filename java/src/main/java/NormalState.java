public class NormalState extends NewScoreState {
    public NormalState(ScoreContext context) {
        super(context);
    }

    @Override
    public void setScore(int player1Score, int player2Score) {
        if((Math.abs(player1Score - player2Score) >= 2) && Math.max(player1Score, player2Score) > 3){
            context.setState(new WinnerState(context));
        }
        if(player1Score == player2Score){
            context.setState(new AllState(context));
        }
    }

    @Override
    public String getScore(int player1Score, int player2Score) {

        return getPlayerScore(player1Score) + "-" + getPlayerScore(player2Score);
    }

    private String getPlayerScore(int playerScore){
        if(playerScore == 0){
            return NewScoreState.LOVE;
        }
        if (playerScore ==1 ){
            return NewScoreState.FIFTEEN;
        }
        if (playerScore == 2){
            return NewScoreState.THIRTY;
        }
        if (playerScore == 3){
            return NewScoreState.FORTY;
        }
        return "score not found";
    }
}
