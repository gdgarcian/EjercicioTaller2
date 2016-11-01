
package taller;

import java.util.*;


public class Tournament {
    
    public Calendar start;
    public Calendar end;
    public ArrayList<Player> players;

    public Tournament(Calendar start, Calendar end) {
        this.start = start;
        this.end = end;
        this.players = new ArrayList<>();
    }

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnd() {
        return end;
    }

    public void setEnd(Calendar end) {
        this.end = end;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    
    
}
