public class Advantage implements Score {
    @Override
    public String setScore(int player1Score, int player2Score) {
        if (player1Score - player2Score == 1) return "Advantage player1";
        else if (player1Score - player2Score == -1) return "Advantage player2";
        else if (player1Score - player2Score >= 2) return "Win for player1";
        else return "Win for player2";
    }

}
