import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        // Print the top ten players based on goals
        System.out.println("Top 10 players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        // Print the top 25 players based on penalty amounts
        System.out.println("Top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        // Print the statistics for Sidney Crosby
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("SC");

        // Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");

        // Print the players in Anaheim Ducks (abbreviation: ANA) ordered by point
        System.out.println("Players in Anaheim Ducks ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
