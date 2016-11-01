
package taller;

import java.util.*;

public class League {
    
    public Calendar start;
    public Calendar end;    
    public ArrayList<Tournament> tournaments;
    public ArrayList<Player> players;

    public League(Calendar start, Calendar end) {
        this.start = start;
        this.end = end;
        this.tournaments = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public void registrarJugador(Player p){
        
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

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(ArrayList<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    
    
    
    
}
