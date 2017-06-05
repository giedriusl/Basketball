
package basketball;

/**
 *
 * @author Giedrius Lukocius
 */

public class Player extends Rookie {
    
    private String name;
    private String surname;
    private int age;
    private int rank;
    private String team;
    private int value;
    private boolean onSale = true;
    private int shirtNum;
    
    public Player(String name,String surname , int age, int rank, String team, int value){
        super(name,surname,age,team,value);
        this.rank = rank;
    }
    
    public Player(){}
    
    
    //Setters and getters
    
    public int getRank(){ 
        return rank;
    }
    
    public void setTeam(String team){
        this.team = team;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public boolean getOnSale(){
        return onSale;
    }
    
    public void setOnSale(boolean onSale){
        this.onSale = onSale;
    }
    
    public void setShirtNum(int shirtNum) {
        this.shirtNum = shirtNum;
    }
    
    public int getShirtNum(){
        return shirtNum;
    }
}