package apcentral.ap2024frq;

/**
 * This question involves a scoreboard for a game. The game is played between two teams who alternate turns so
that at any given time, one team is active and the other team is inactive. During a turn, a team makes one or
more plays. Each play can score one or more points and the team’s turn continues, or the play can fail, in
which case no points are scored and the team’s turn ends. The Scoreboard class, which you will write, is
used to keep track of the score in a game.
 */
public class Scoreboard {
    private String team1name;
    private String team2name;
    private String activeTeam;
    private int team1score;
    private int team2score;

    /**
     * The constructor has two parameters. The first parameter is a String containing the
name of team 1, and the second parameter is a String containing the name of team 2.
The game always begins with team 1 as the active team.
     * @param team1
     * @param team2
     */
    public Scoreboard(String team1, String team2) {
        this.team1name = team1;
        this.team2name = team2;
        this.activeTeam = team1;
    }

    /**
     * The recordPlay method has a single nonnegative integer parameter that is equal to the
number of points scored on a play or 0 if the play failed. If the play results in one or
more points scored, the active team’s score is updated and that team remains active. If the
value of the parameter is 0, the active team’s turn ends and the inactive team becomes the
active team. The recordPlay method does not return a value.
     * @param pointsScored
     */
    public void recordPlay(int pointsScored) {
        if (activeTeam.equals(team1name)) {
            team1score += pointsScored;
            if (pointsScored == 0)
                activeTeam = team2name;
        } else {
            team2score += pointsScored;
            if (pointsScored == 0)
                activeTeam = team1name;
        }
    }

    /**
     * The getScore method has no parameters. The method returns a String containing
    information about the current state of the game. The returned string begins with the score of
    team 1, followed by a hyphen ("-"), followed by the score of team 2, followed by a
    hyphen, followed by the name of the team that is currently active.
     * @return
     */
    public String getScore(){
        return String.format("%d-%d-%s",  team1score, team2score, team2name);
    }
}
