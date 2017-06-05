package basketball;

/**
 *
 * @author giedr
 */
public class Rookie {
    private String name;
    private String surname;
    private String team;
    private int value;
    private int age;
    
    public Rookie(String name, String surname,int age, String team, int value){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.team = team;
        this.value = value;
    }
    public Rookie(){}
    
    public String getName(){ 
       return name; 
    }
    
    public String getSurname(){
        return surname;
    }
    
    public int getAge(){ 
        return age;
    }
    
    public String getTeam() { 
        return team;
    }   
    
    public int getValue(){ 
        return value;
    }
}
