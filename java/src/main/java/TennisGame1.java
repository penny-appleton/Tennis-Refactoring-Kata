
public class TennisGame1 implements TennisGame {

    private final Player player1;
    private final Player player2;
    private Score state;

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        state = new All();
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName()))
            player1.addPoint();
        else
            player2.addPoint();
    }

    public String getScore() {
        if (player1.getScore() == player2.getScore()) {
            return state.setScore(player1.getScore(), player2.getScore());
        } else if (player1.getScore() >= 4 || player2.getScore() >= 4) {
            state = new Advantage();
            return state.setScore(player1.getScore(), player2.getScore());
        } else {
            state = new Normal();
            return state.setScore(player1.getScore(), player2.getScore());
        }

    }

}
