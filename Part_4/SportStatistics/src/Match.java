public class Match {
    private String host;
    private String visitor;
    private String winner;
    private int visitorPoints;
    private int hostPoints;

    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.host = homeTeam;
        this.visitor = visitingTeam;
        this.hostPoints = homeTeamPoints;
        this.visitorPoints = visitingTeamPoints;
        this.winner = this.getWinner();
    }

    public String getWinner() {
        if (this.hostPoints > this.visitorPoints) {
            return this.host;
        }
        return this.visitor;
    }

    public String getHost(){
        return this.host;
    }

    public String getVisitor(){
        return this.visitor;
    }


    public String toString(){
        return this.host + "("+ this.hostPoints+") | " + this.visitor +" ("+ this.visitorPoints+")";
    }

}