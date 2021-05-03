public class Player {

    private final String name;
    private int score;

    public Player(String playerName) {
        name = playerName;
        score = 0;
    }

    public String getName(){
        return name;
    }

    public void addPoint() {
        score += 1;
    }

    public int getScore() {
        return score;
    }
}
