
package files;

import basketball.Player;
import basketball.MyTeam;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author giedr
 */
public class Writer {
    
    BufferedWriter writer;
	
	public Writer(String name) throws IOException {
		writer = new BufferedWriter(new FileWriter(name));
	}
	
    public void toWrite(MyTeam details){

        try {
           
            writer.write("=======================YOUR TEAM=============================");
            writer.newLine();
            for(Player player: details.getPlayers()){
                if(player != null){
                    writer.write("Player: " + player.getName() + " " + player.getSurname());
                    writer.newLine();
                    writer.write("Age: " + player.getAge() + " || Player rank: " + player.getRank() + " || Team: " + player.getTeam() + " || Value: " + player.getValue() + "$" + " || Shirt number: " + player.getShirtNum());
                    writer.newLine();
		    writer.newLine();
                }
            }
            if(details.getCoach() != null){
                writer.write("Coach: " + details.getCoach().getName() + " " + details.getCoach().getSurname() + " ");
                writer.write("Age: " + details.getCoach().getAge() + " || Team: " + details.getCoach().getTeam() + " || Value: " + details.getCoach().getValue());
                writer.newLine();
				writer.newLine();
            }
            if(details.getArena() != null){
                writer.write("Arena: " + details.getArena().getNameAr() + " ");
                writer.write("Available: " + details.getArena().getAvailable() + " || Rent value: " + details.getArena().getRentValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
         try{
			if(writer != null)
				writer.close();
         } catch(IOException e) {
              e.printStackTrace();
         }
		}
    }
}
