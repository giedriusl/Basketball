
package basketball;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Giedrius Lukocius
 */

public class Team {
    
    private String teamName;
    private int money = 0; 
    private Coach coach = null;
    private Arena arena = null;
    private Set<Player> players = new HashSet<Player>();

    public void setMoney(int newValue){
        this.money -= newValue;
    }
    
    public void setFirstMoney(int newValue){
        this.money = newValue;
    }
    
    public int getMoney(){
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
	
    public boolean buyingPlayer(Player newPl){
        return this.players.add(newPl);
    }
    
    public void hiringCoach(Coach coach) {
        this.coach = coach;
    }
	
    public void rentingArena(Arena arena){
        this.arena = arena;
    }

}
