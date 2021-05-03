public class All implements Score{
    @Override
    public String setScore(int scoreIncrement) {
        if(scoreIncrement == 0){
            return Score.LOVE + "-All";
        }
        if(scoreIncrement == 1){
            return Score.FIFTEEN + "-All";
        }
        if(scoreIncrement == 2){
            return Score.THIRTY + "-All";
        }
        return "Deuce";
    }

    @Override
    public String getState() {
        return "All";
    }
}
