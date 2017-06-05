
package basketball;

/**
 *
 * @author Giedrius Lukocius
 */

public class Arena extends Gym{
    
    private String nameAr;   // Arena name
    private int rentValue;
    private boolean available;
    
    public Arena(){}
    
    public Arena(String nameAr,int rentValue,boolean available){
        this.nameAr = nameAr;
        this.rentValue = rentValue;
        this.available = available;
    }
    
    //Setter and getters
    
    @Override
    public String getNameAr(){
        return nameAr;
    }
    
    public void setNameAr(String nameAr){
        this.nameAr = nameAr;
    }
    
    public int getRentValue(){
        return rentValue;
    }
    
    public void setRentValue(int rentValue){
        this.rentValue = rentValue;
    }
    
    @Override
    public boolean getAvailable(){
        return available;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
    
}