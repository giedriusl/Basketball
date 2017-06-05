
package basketball;

/**
 *
 * @author Giedrius Lukocius
 */

public class Coach extends Rookie {
    private String name;
    private String surname;
    private int age;
    private String team;
    private int value;
    
    public Coach(){}
    
    public Coach(String name,String surname,int age,String team,int value){
        super(name,surname,age,team,value);
    }
    
    //Setter and getters 

    public void setTeam(String team){
        this.team = team;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
}