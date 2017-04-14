
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
    
    public Player(String name,String surname , int age, int rank, String team, int value, int shirtNum){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.rank = rank;
        this.team = team;
        this.value = value;
        this.shirtNum = shirtNum;
    }
    
    public Player(){}
    
    
    //Setters and getters (Name,age,rank,team,value)
    
    public String getName(){ //name
       return name; 
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge(){ //age
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getRank(){ //rank
        return rank;
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }
    
    public String getTeam() { //team
        return team;
    }   
    
    public void setTeam(String team){
        this.team = team;
    }
    
    public int getValue(){ //value
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