
package files;

import basketball.Arena;
import basketball.Coach;
import basketball.Player;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;
/**
 *
 * @author Giedrius Lukocius
 */
public class Read {
    
    BufferedReader reader;
    BufferedReader readerOne;
    
    public Read (String name) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(name));
    }
    
    public Read(String name, String nameOne) throws FileNotFoundException{
        reader = new BufferedReader(new FileReader(name));
        readerOne = new BufferedReader(new FileReader(nameOne));
    }

    Read(){}
    
    
    public Set<Player> getPlayersList() throws IOException {
        
        String line = null;

        Set<Player> players = new HashSet<Player>();
        
        String[] splitt = new String[6];
            
        while((line = reader.readLine()) != null){
            splitt = line.split(";");
            String name = splitt[0];
            String surname = splitt[1];
            int age = Integer.parseInt(splitt[2]);
            int rank = Integer.parseInt(splitt[3]);
            String team = splitt[4];
            int value = Integer.parseInt(splitt[5]);
            Player player = new Player(name,surname,age,rank,team,value);
            players.add(player);
        }
        reader.close();
        
        return players;
    }

    public Coach[] getCoachesList() throws IOException {
        
        String line = null;
        
        int i = 0;  
        while(reader.readLine() != null){
            i++;
        }
        reader.close();

        Coach[] coaches = new Coach[i];
        
        String[] splitt = new String[5];
        i = 0;
        while((line = readerOne.readLine()) != null){
            splitt = line.split(";");
            String name = splitt[0];
            String surname = splitt[1];
            int age = Integer.parseInt(splitt[2]);
            String team = splitt[3];
            int value = Integer.parseInt(splitt[4]);
            coaches[i] = new Coach(name,surname,age,team,value);
            i++;
        }
        readerOne.close();
        
        return coaches;
    }
        
   public Arena[] getArenaList() throws IOException {
        String line = null;
        
        int i = 0;
        while(reader.readLine() != null){
            i++;
        }
        reader.close();

        Arena[] arenas = new Arena[i];
        
        String[] splitt = new String[3];
        i = 0;
        while((line = readerOne.readLine()) != null){
            splitt = line.split(";");
            String name = splitt[0];
            int rentValue = Integer.parseInt(splitt[1]);
            boolean available = Boolean.parseBoolean(splitt[2]);
            arenas[i] = new Arena(name,rentValue,available);
            i++;
        }
        readerOne.close();
        
        return arenas;
    }
}