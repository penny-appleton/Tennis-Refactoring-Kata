public class Normal implements Score {
    private String score;

    @Override
    public String setScore(int player1Score, int player2Score) {

        return getPlayerScore(player1Score) + "-" + getPlayerScore(player2Score);
    }


    @Override
    public String getState() {
        return "Normal";
    }

    private String getPlayerScore(int playerScore){
        if(playerScore == 0){
            return Score.LOVE;
        }
        if (playerScore ==1 ){
            return Score.FIFTEEN;
        }
        if (playerScore == 2){
            return Score.THIRTY;
        }
        if (playerScore == 3){
            return Score.FORTY;
        }
        return "score not found";
    }
}
