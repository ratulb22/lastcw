import java.util.Vector;

public class PhoneBook {

    private Vector<PhoneBookEntry> entries;

    public PhoneBook( ) {
        entries = new Vector<PhoneBookEntry>();
    }

    public void add( String name, String nameid, String careerscore, String teamname, String teamid, String homestadium, String homestreet, String hometown, String postcode ) {
		entries.add(new PhoneBookEntry(name, nameid, careerscore, teamname, teamid, homestadium, homestreet, hometown, postcode));
    }

    public String numberFor( String name ) {
        for (int i = 0; i < entries.size(); ++i) {
            if ( entries.get(i).getName().equals(name) ) {
                return entries.get(i).getNumber();
            }
        }
        return "NOT FOUND";
    }

    public String toString( ) {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < entries.size(); ++i) {
            temp.append( entries.get(i).toString() + "\n" );
        }
        return temp.toString();
    }

}