
public class TennisGame1 implements TennisGame {

    private final Player player1;
    private final Player player2;
    private final Score score = new Score();
    private ScoreState state;

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        state = score.getState();
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName())) {
            player1.addPoint();
        } else {
            player2.addPoint();
        }
    }

    public String getGameScore() {
        if (player1.getScore() == player2.getScore()) {
            state.setScore(player1.getScore(), player2.getScore());
            return state.getScore();
        } else if (player1.getScore() >= 4 || player2.getScore() >= 4) {
            state = new Advantage();
            state.setScore(player1.getScore(), player2.getScore());
            return state.getScore();
        } else {
            state = new Normal();
            state.setScore(player1.getScore(), player2.getScore());
            return state.getScore();
        }

    }

}
