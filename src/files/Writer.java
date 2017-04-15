
package files;

import basketball.Player;
import basketball.Team;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author giedr
 */
public class Writer {
    
    private static final String fileName = ("C:\\Users\\giedr\\Desktop\\Atsiskaitymui\\Objektinis\\Basketball\\src\\basketball\\TeamDetails.txt");
    
    public void toWrite(Team details){
       
        BufferedWriter bw = null;
        FileWriter fw = null;
       
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
           
            bw.write("=======================YOUR TEAM=============================");
            bw.newLine();
            for(Player player: details.getPlayers()){
                if(player != null){
                    bw.write("Player: " + player.getName() + " " + player.getSurname());
                    bw.newLine();
                    bw.write("Age: " + player.getAge() + " || Player rank: " + player.getRank() + " || Team: " + player.getTeam() + " || Value: " + player.getValue() + "$" + " || Shirt number: " + player.getShirtNum());
                    bw.newLine();
		    bw.newLine();
                }
            }
            if(details.getCoach() != null){
                bw.write("Coach: " + details.getCoach().getName() + " " + details.getCoach().getSurname());
                bw.write("Age: " + details.getCoach().getAge() + " || Team: " + details.getCoach().getTeam() + " || Wage: " + details.getCoach().getWage());
                bw.newLine();
		bw.newLine();
            }
            if(details.getArena() != null){
                bw.write("Arena: " + details.getArena().getNameAr());
                bw.write("Available: " + details.getArena().getAvailable() + " || Rent value: " + details.getArena().getRentValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(bw != null)
                    bw.close();
           
                if(fw != null)
                    fw.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
