
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;
    private String score;
    private Score state;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        state = new All();
        score = state.setScore(m_score1, m_score2);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    //Code smells:  Switch Statements, temp field
    public String getScore() {
        if (m_score1 == m_score2) {
            return score = state.setScore(m_score1, m_score2);
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            state = new Advantage();
            return score = state.setScore(m_score1, m_score2);
        } else {
            state = new Normal();
            return score = state.setScore(m_score1, m_score2);
        }

    }

}
