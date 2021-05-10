
public class TennisGame2 implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    private ScoreContext context = new ScoreContext();



    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        context.setState(new AllState(context));
    }

    public String getScore() {

        String score = "";

        if (P1point == P2point && P1point < 4) {
            score = getScoreString(P1point);
            score += "-All";

        }
        if (P1point == P2point && P1point >= 3)
            score = "Deuce";

        if (P1point > 0 && P2point == 0) {
            P1res = getScoreString(P1point);

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point == 0) {
            P2res = getScoreString(P2point);

            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P1point < 4) {
            P1res = getScoreString(P1point);
            P2res = getScoreString(P2point);
            score = P1res + "-" + P2res;
        }
        if (P2point > P1point && P2point < 4) {
            P2res = getScoreString(P2point);
            P1res = getScoreString(P1point);
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P2point >= 3) {
            score = "Advantage player1";
        }

        if (P2point > P1point && P1point >= 3) {
            score = "Advantage player2";
        }

        if (P1point >= 4 && P2point >= 0 && (P1point - P2point) >= 2) {
            score = "Win for player1";
        }
        if (P2point >= 4 && P1point >= 0 && (P2point - P1point) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    private String getScoreString(int point) {
        if (point == 0)
            return "Love";
        if (point == 1)
            return "Fifteen";
        if (point == 2)
            return "Thirty";
        if (point == 3)
            return "Forty";
        return "";
    }

    public void wonPoint(String player) {
        if (player.equals("player1")) {
            P1point++;
            context.setScore(player);
        } else {
            P2point++;
            context.setScore(player);
        }

    }
}