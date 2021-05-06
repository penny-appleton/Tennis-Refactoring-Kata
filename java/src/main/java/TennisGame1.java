
public class TennisGame1 implements TennisGame {

    private final Player player1;
    private final Player player2;
    private final ScoreContext scoreContext = new ScoreContext();

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        scoreContext.setState(new AllState(scoreContext));
    }

    public void wonPoint(String playerName) {

        scoreContext.setScore(playerName);
    }

    public String getGameScore() {
        return scoreContext.getScore();

    }

}
