public class AdvantageState extends ScoreState {
    public AdvantageState(ScoreContext context) {
        super(context);
    }

    @Override
    public void setScore(int player1Score, int player2Score) {
        if(player1Score == player2Score){
            context.setState(new AllState(context));
        } else context.setState(new Winner(context));
    }

    @Override
    public String getScore(int player1Score, int player2Score) {
        if(player1Score > player2Score){
            return "Advantage player1";
        }
        return "Advantage player2";
    }
}
