
package basketball;

/**
 *
 * @author Giedrius Lukocius
 */

public class Arena {
    
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
    
    public boolean getAvailable(){
        return available;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
    
}