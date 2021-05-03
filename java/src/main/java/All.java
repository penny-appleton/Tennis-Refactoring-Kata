public class All implements Score{
    @Override
    public String setScore(int player1Score, int Player2Score) {
        if(player1Score == 0){
            return Score.LOVE + "-All";
        }
        if(player1Score == 1){
            return Score.FIFTEEN + "-All";
        }
        if(player1Score == 2){
            return Score.THIRTY + "-All";
        }
        return "Deuce";
    }

    @Override
    public String getState() {
        return "All";
    }
}
