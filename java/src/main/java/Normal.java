public class Normal implements ScoreState {
    private String score;


    public void setScore(int player1Score, int player2Score) {

        score = getPlayerScore(player1Score) + "-" + getPlayerScore(player2Score);
    }

    public String getScore() {
        return score;
    }

    private String getPlayerScore(int playerScore){
        if(playerScore == 0){
            return ScoreState.LOVE;
        }
        if (playerScore ==1 ){
            return ScoreState.FIFTEEN;
        }
        if (playerScore == 2){
            return ScoreState.THIRTY;
        }
        if (playerScore == 3){
            return ScoreState.FORTY;
        }
        return "score not found";
    }
}
