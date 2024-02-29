class Team {
  private String teamName;
  private int teamRank;
  private String playerName;

  //constructor
  public Team(String teamName){
    this.teamName = teamName;
  }

  public void setRank(int rank){
    this.teamRank = rank;
  }

  public String toString() {
    return "Team: " + teamName + " Rank: " + teamRank;
  }

}
