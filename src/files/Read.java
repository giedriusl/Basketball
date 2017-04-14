
package files;

import basketball.Arena;
import basketball.Coach;
import basketball.Player;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Giedrius Lukocius
 */
public class Read {
	
    static final String filename1 = "C:\\Users\\giedr\\Desktop\\Atsiskaitymui\\Objektinis\\Basketball\\src\\basketball\\Players.txt";	
    static final String filename2 = "C:\\Users\\giedr\\Desktop\\Atsiskaitymui\\Objektinis\\Basketball\\src\\basketball\\Coaches.txt";
    static final String filename3 = "C:\\Users\\giedr\\Desktop\\Atsiskaitymui\\Objektinis\\Basketball\\src\\basketball\\Arenas.txt";
    
    public Set<Player> getPlayersList() throws IOException {
        
        String line = null;
        
        BufferedReader br1 = new BufferedReader(new FileReader(filename1));
        
        Set<Player> players = new HashSet<Player>();
        
        String[] splitt = new String[6];
            
        while((line = br1.readLine()) != null){
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
        br1.close();
        
        return players;
    }

    public Coach[] getCoachesList() throws IOException {
        
        
        BufferedReader br = new BufferedReader(new FileReader(filename2));
        String line = null;
        
        int i = 0;  
        while(br.readLine() != null){
            i++;
        }
        br.close();
        
        BufferedReader br1 = new BufferedReader(new FileReader(filename2));
        
        Coach[] coaches = new Coach[i];
        
        String[] splitt = new String[5];
        i = 0;
        while((line = br1.readLine()) != null){
            splitt = line.split(";");
            String name = splitt[0];
            String surname = splitt[1];
            int age = Integer.parseInt(splitt[2]);
            String team = splitt[3];
            int wage = Integer.parseInt(splitt[4]);
            coaches[i] = new Coach(name,surname,age,team,wage);
            i++;
        }
        br1.close();
        
        return coaches;
    }
        
   public Arena[] getArenaList() throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader(filename3));
        String line = null;
        
        int i = 0;
        while(br.readLine() != null){
            i++;
        }
        br.close();
        
        BufferedReader br1 = new BufferedReader(new FileReader(filename3));
        
        Arena[] arenas = new Arena[i];
        
        String[] splitt = new String[3];
        i = 0;
        while((line = br1.readLine()) != null){
            splitt = line.split(";");
            String name = splitt[0];
            int rentValue = Integer.parseInt(splitt[1]);
            boolean available = Boolean.parseBoolean(splitt[2]);
            arenas[i] = new Arena(name,rentValue,available);
            i++;
        }
        br1.close();
        
        return arenas;
    }
}