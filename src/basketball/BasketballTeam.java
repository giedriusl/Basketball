package basketball;

/**
 *
 * @author giedr
 */
public interface BasketballTeam {
    
    void setMoney(int newValue);
    
    long getMoney();
    
    String getTeamName();
    
    public Coach getCoach();
    
    public Arena getArena();
	
    public boolean buyingPlayer(Player newPl);
    
    public void hiringCoach(Coach coach);
	
    public void rentingArena(Arena arena);
    
}
