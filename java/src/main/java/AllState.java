public class AllState extends ScoreState {
    private static final String ALL = "-All";

    public AllState(ScoreContext context) {
        super(context);
    }

    @Override
    public void setScore(int player1Score, int player2Score) {
        if (Math.max(player1Score, player2Score) <= 3) {
            context.setState(new NormalState(context));
        } else context.setState(new AdvantageState(context));

    }

    @Override
    public String getScore(int player1Score, int player2Score) {
        if (player1Score == 0) return LOVE + ALL;
        if (player1Score == 1) return FIFTEEN + ALL;
        if (player1Score == 2) return THIRTY + ALL;
        else return "Deuce";
    }
}
