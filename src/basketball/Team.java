
package basketball;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Giedrius Lukocius
 */

public class Team {
    
    private String teamName;
    private int money = 0; 
    //private Team[] rivals;
    private Coach coach = null;
    private Arena arena = null;
    private List<Player> players = new ArrayList<Player>();

    
    public Team(){}
    

    public void setMoney(int newValue){
        this.money -= newValue;
    }
    
    public void setFirstMoney(int newValue){
        this.money = newValue;
    }
    
    public int getMoney(){
        return money;
    }
    
  /*  public Team[] getRivals(){
        return rivals;
    } */
    
    public String getTeam() { //team
       return teamName;
    }   
    
    public void setTeam(String name){
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
   /* public static void recentGames(Team details) {
        UserInterface print = new UserInterface();
        Team[] rivals = details.getRivals();
        print.printGames(1);
        for(Team opponent: rivals){
            int day = (int )(Math.random() * 30 + 1);
            int month = (int )(Math.random() * 6 + 1);
            print.printGames(2,opponent,day,month);
        }
    } */
	
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
