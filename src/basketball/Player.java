
package basketball;

/**
 *
 * @author Giedrius Lukocius
 */

public class Player {
    
    private String name;
    private String surname;
    private int age;
    private int rank;
    private String team;
    private int value;
    private boolean onSale = true;
    private int shirtNum;
    
    public Player(String name,String surname , int age, int rank, String team, int value){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.rank = rank;
        this.team = team;
        this.value = value;
    }
    
    public Player(){}
    
    
    //Setters and getters
    
    public String getName(){ 
       return name; 
    }
    
    public String getSurname(){
        return surname;
    }
    
    public int getAge(){ 
        return age;
    }
    
    public int getRank(){ 
        return rank;
    }
    
    public String getTeam() { 
        return team;
    }   
    
    public void setTeam(String team){
        this.team = team;
    }
    
    public int getValue(){ 
        return value;
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