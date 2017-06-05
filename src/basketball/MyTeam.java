
package basketball;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Giedrius Lukocius
 */

public class MyTeam implements BasketballTeam {
    
    private String teamName;
    private long money = 0; 
    private Coach coach = null;
    private Arena arena = null;
    private Set<Player> players = new HashSet<Player>();

    public void setMoney(int newValue){
        this.money -= newValue;
    }
    
    public void setFirstMoney(long newValue){
        this.money = newValue;
    }
    
    public long getMoney(){
        return money;
    }
    
    
    public String getTeamName() { 
       return teamName;
    }   
    
    public void setTeamName(String name){
	this.teamName = name;
    }
    
    public Coach getCoach(){
        return coach;
    }
    
    public Arena getArena(){
        return arena;
    }
    
    public Set<Player> getPlayers(){
        return players;
    }
    
    public boolean buyingPlayer(Player newPl){    //Buying
        return this.players.add(newPl);
    }
    public void hiringCoach(Coach coach) {       //Hiring
        this.coach = coach;
    }
	
    public void rentingArena(Arena arena){       //Renting
        this.arena = arena;
    }

}
