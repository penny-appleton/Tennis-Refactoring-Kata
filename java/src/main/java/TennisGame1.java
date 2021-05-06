
public class TennisGame1 implements TennisGame {

    private final String player1;
    private final String player2;
    private final ScoreContext scoreContext = new ScoreContext();

    public TennisGame1(String player1Name, String player2Name) {
        player1 = "player1";
        player2 = "player2";
        scoreContext.setState(new AllState(scoreContext));
    }

    public void wonPoint(String playerName) {

        scoreContext.setScore(playerName);
    }

    public String getGameScore() {
        return scoreContext.getScore();

    }

}
