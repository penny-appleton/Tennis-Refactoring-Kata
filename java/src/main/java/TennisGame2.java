
public class TennisGame2 implements TennisGame {
    private String player1Name;
    private String player2Name;
    private ScoreContext context = new ScoreContext();


    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        context.setState(new AllState(context));
    }

    public String getScore() {
       return context.getScore();

    }

    public void wonPoint(String player) {
        context.setScore(player);

    }
}