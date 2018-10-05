import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> team;
    private int maxSize;

    public Team(String name) { this.name = name;     this.team = new ArrayList<Player>();     this.maxSize = 16; }

    public String getName() { return this.name; }

    public void addPlayer(Player player) {
        if (!(size() >= this.maxSize)) {
            this.team.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : team) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) { this.maxSize = maxSize; }

    public int size() {
        int size=0;
        for (Player player : team) {
            size++;
        }
        return size;
    }

    public int goals() {
        int goals=0;
        for (Player player : team) {
            goals += player.goals();
        }
        return goals;
    }
}
