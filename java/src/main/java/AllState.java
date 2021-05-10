public class AllState extends ScoreState {

    public AllState(ScoreContext context) {
        super(context);
    }

    @Override
    public void setScore(int player1Score, int player2Score) {
        if(Math.max(player1Score, player2Score) <= 3){
           context.setState(new NormalState(context));
        }
    }
}
