
package basketball;

/**
 *
 * @author Giedrius Lukocius
 */

public class Coach {
    private String name;
    private String surname;
    private int age;
    private String team;
    private int wage;
    
    public Coach(){}
    
    public Coach(String name,String surname,int age,String team,int wage){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.team = team;
        this.wage = wage;
    }
    
    //Setter and getters 
    
    public String getName(){
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
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getTeam(){
        return team;
    }
    
    public void setTeam(String team){
        this.team = team;
    }
    
    public int getWage(){
        return wage;
    }
    
    public void setWage(int wage){
        this.wage = wage;
    }
    
}