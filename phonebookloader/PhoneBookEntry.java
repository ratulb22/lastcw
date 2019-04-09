class PhoneBookEntry {

    private String name;
    private String nameid;
    private String careerscore;
    private String teamname;
    private String teamid;
    private String homestadium;
    private String homestreet;
    private String hometown;
    private String postcode;



    public PhoneBookEntry( String inName, String inNumber, String inCareerScore, String inTeamName, String inTeamid, String inHomeStadium, String inHomeStreet, String inHomeTown, String inPost ) {
        name = inName;
        nameid = inNumber;
        careerscore = inCareerScore;
        teamname = inTeamName;
        teamid = inTeamid;
        homestadium = inHomeStadium;
        homestreet = inHomeStreet;
        hometown = inHomeTown;
        postcode = inPost;

     }

    public String getName( ) {
        return name;
    }

    public String getNumber( ) {
        return nameid;
    }

    public String getCarScore( ) {
        return careerscore;
    }

    public String getTeamName( ) {
        return teamname;
    }

    public String getTeamid( ) {
        return teamid;
    }

    public String getHomeStadium( ) {
        return homestadium;
    }

    public String getHomeStreet( ) {
        return homestreet;
    }

    public String getHomeTown( ) {
        return hometown;
    }

    public String getPostCode( ) {
        return postcode;
    }


    public String toString( ) {
        return name + "\t(" + nameid + ") " + " " + careerscore + "  " + teamname + "  " + teamid + "  " + homestadium + "  " + homestreet + "  " + hometown + "  " postcode;
    }


}