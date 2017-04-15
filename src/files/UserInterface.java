
package files;

import basketball.Arena;
import basketball.Coach;
import basketball.Player;
import basketball.Team;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author giedr
 */
public class UserInterface {
    
    public void start() throws IOException{
        
        boolean end = false;
        boolean let = true;
        
        Scanner sc1 = new Scanner(System.in);
        
        UserInterface inter = new UserInterface();
        Team details = new Team();

        Set<Player> list = new Read().getPlayersList();     //
        Writer writer = new Writer();                      //
        Coach[] coaches = new Read().getCoachesList();    //kur laikyti?????????
        Arena[] arenas = new Read().getArenaList();
                
        inter.programStart(1,details);    
        details.setTeamName(sc1.nextLine());
        inter.programStart(2,details);
        inter.enterMoney(1);
        int money = sc1.nextInt();
        details.setFirstMoney(money);
        inter.programStart(3,details);
     
        while(end == false){
            
            inter.actions(1);
            Scanner enterInput = new Scanner(System.in);

            String enterkey = enterInput.nextLine();
            if("".equals(enterkey)){
        
                inter.actions(2);
        
                Scanner sc = new Scanner(System.in);
                int dec = sc.nextInt();
        
                switch(dec){
                    case 1 :
                        inter.playerList(list);
                        break;
                    case 2 :
                        new UserInterface().buyingPlayer(list,details);
                        break;
                    case 3 :
                        inter.teamPlayers(details);
                        writer.toWrite(details);
                        break;
                    case 4 :
                        inter.coachesList(coaches);
                        break;
                    case 5 :
                        new UserInterface().hiringCoach(coaches, details);
                        break;
                    case 6 :
                        inter.arenasList(arenas);
                        break;
                    case 7 :
                        let = inter.checkTeam(details, let);
                        if (let == true){
                            new UserInterface().rentingArena(arenas, details);
                        }
                        break;
                    case 8 :
                        end = true;
                        System.out.println("Execution finished.");
                        break;
                    default :
                        System.out.println("Invalid decision.");
                }
            }
        }
        
    }
    
    public void programStart(int i,Team details){
        
        if(i == 1){
            System.out.println("Enter your team's name: ");
        } else if(i == 2) {
            System.out.println("Now your team is " + details.getTeamName());
        } else if(i == 3) {
            System.out.println("You have " + details.getMoney() + "$.");
        }
    }
    
    public void actions(int i){
        if(i == 1){
            System.out.println("Press enter for action list ");
        } else if(i == 2){
	    System.out.println("**1 - Players on sale**");
            System.out.println("**2 - Buying a player**");
            System.out.println("**3 - Show your team**");
            System.out.println("**4 - Show coaches for hiring");
            System.out.println("**5 - Hiring coach**");
            System.out.println("**6 - Arenas for rent**");
            System.out.println("**7 - Renting arena**");
            System.out.println("**8 - End of program**");
            System.out.println("====================");
        }
    }
    
    public void playerList(Set<Player> list)  {
        System.out.println("===================================== ON SALE =======================================");
        for(Player player: list){
            if(player.getOnSale()){
                System.out.println("Player: " + player.getName() + " " + player.getSurname());
                System.out.println("Age: " + player.getAge() + " || Player rank: " + player.getRank() + " || Team: " + player.getTeam() + " || Value: " + player.getValue() + "$");
                System.out.println("");
            }
        }
    }
    
    public void coachesList(Coach[] coaches){
        System.out.println("=====================================================================================");
        for(Coach manager: coaches){
            
            System.out.println("Coach: " + manager.getName() + " " + manager.getSurname());
            System.out.println("Age: " + manager.getAge() + " || Team: " + manager.getTeam() + " || Wage: " + manager.getWage() + "$");
            System.out.println("");
            
        }
    }
    
    public void arenasList(Arena[] arenas){
        System.out.println("===================================Arenas==========================================");
        for(Arena gym: arenas){
            
            System.out.println("Arena: " + gym.getNameAr());
            System.out.println("Available: " + gym.getAvailable() + " || Rent value: " + gym.getRentValue());
            System.out.println("");
            
        }
    }
    
    
    public void buyingPrint() {
        System.out.println("Enter player's surname you want to buy: ");
    }
    
    public void buyingPrint (int i,String surname, Player salable) {
        switch(i) {
            case 1 :
                System.out.println("There's no player with surname " + surname);
                break;
            case 2 :
                System.out.println("Player: " + salable.getName() + " " + salable.getSurname());
                System.out.println("Age: " + salable.getAge() + " || Player rank: " + salable.getRank() + " || Team: " + salable.getTeam() + " || Value: " + salable.getValue() + "$");
                System.out.println("Are you sure you want to buy " + salable.getSurname() + "? " + "y/n");
                break;
            case 3 :
                System.out.println("Enter shirt number for " + surname);
                break;
        }
    }
    
    public void hiringPrint(){
        System.out.println("Enter coach's surname you want to hire: ");
    }
    
    public void hiringPrint(int i,String surname,Coach hired){
        switch(i){
            case 1 :
                System.out.println("There's no coach with surname " + surname);
                break;
            case 2 :
                System.out.println("Player: " + hired.getName() + " " + hired.getSurname());
                System.out.println("Age: " + hired.getAge() + " || Team: " + hired.getTeam() + " || Wage: " + hired.getWage() + "$");
                System.out.println("Are you sure you want to hire " + surname + "? " + "y/n");  
                break;
        }
    }
    
    public boolean checkTeam(Team details, boolean let){
        if(details.getPlayers().size() < 4 && details.getCoach() != null){
            System.out.println("You don't have enough players.");
            System.out.println("");
            let = false;
        } else if(details.getPlayers().size() >= 4 && details.getCoach().getName() == null) {
            System.out.println("You need to hire a coach.");
            let = false;
        } else if(details.getPlayers().size() < 4 && details.getCoach().getName() == null) {
            System.out.println("You need more players and a coach.");
            let = false;
        } else {
            let = true;
        }
        return let;
    }
    
    public void teamPlayers(Team details){
        System.out.println("==================YOUR TEAM=============================");
        for(Player player: details.getPlayers()){
            if(player != null){
                System.out.println("Player: " + player.getName() + " " + player.getSurname());
                System.out.println("Age: " + player.getAge() + " || Player rank: " + player.getRank() + " || Team: " + player.getTeam() + " || Value: " + player.getValue() + "$" + " || Shirt number: " + player.getShirtNum());
                System.out.println("");
            }
        }
        if(details.getCoach() != null){
            System.out.println("Coach: " + details.getCoach().getName() + " " + details.getCoach().getSurname());
            System.out.println("Age: " + details.getCoach().getAge() + " || Team: " + details.getCoach().getTeam() + " || Wage: " + details.getCoach().getWage());
            System.out.println("");
        } else
        {
            System.out.println("Coach is missing.");
            System.out.println("");
        }
        if(details.getArena() != null){
            System.out.println("Arena: " + details.getArena().getNameAr());
            System.out.println("Available: " + details.getArena().getAvailable() + " || Rent value: " + details.getArena().getRentValue());
        } else 
        {
            System.out.println("Arena: waiting");
            System.out.println("");
        }
    }
    
    public void rentingPrint(){
        System.out.println("Enter arena's name you want to rent: ");
    }
    
    public void rentingPrint(int i,String arenaName,Arena forRent){
        switch(i){
            case 1 :
                System.out.println("There's no such arena called " + arenaName);
                break;
            case 2 :
                System.out.println("Arena: " + forRent.getNameAr());
                System.out.println("Available: " + forRent.getAvailable() + " || Rent value: " + forRent.getRentValue());
                break;
            case 3 :
                System.out.println("Are you sure you want to rent " + forRent.getNameAr() + "? " + "y/n");
                break;
            case 4 :
                System.out.println("This arena is unavailable to rent.");
                break;
        }
    }
    
    public void printMoney(){
        System.out.println("You don't have enough money!");
    }
    
    public void printMoney(Team details){
        System.out.println("Your money now: " + details.getMoney());
    }
    
    public void shirtError(){
        System.out.println("This shirt number is unavailable.");
    }
    
    public void enterMoney(int i){
        if(i == 1)
            System.out.println("Enter how much money you want.");
    }
    
    public void buyingPlayer(Set<Player> list, Team details){
        
        UserInterface printer = new UserInterface();
        
        
        int i = 0;
        Player salable = null;
        String surname;
        
        printer.buyingPrint();
        
        Scanner sc = new Scanner(System.in);
        surname = sc.nextLine();
        
        
        for (Player player: list) {   //Checks if there is a player you want
            if(player != null){
                if(player.getSurname().contains(surname))
                {
                    salable = player;
                    break;
                }
            }
        }
        
        if (salable == null || !salable.getOnSale()){
            printer.buyingPrint(1,surname,salable);     //There's no such player
        } else
        {
            printer.buyingPrint(2,surname,salable);    //Do you really want to buy?...
            String ans = sc.nextLine();
            if(ans.equals("y")){
                int value = salable.getValue(); 
                if(details.getMoney() >= salable.getValue()){
                    printer.buyingPrint(3,surname,salable);
                    int shirtNum = sc.nextInt();
                    for(Player player: details.getPlayers()){
                        if(shirtNum == player.getShirtNum())
                        {
                            printer.shirtError();
                            return;
                        }
                    }
                    salable.setOnSale(false);
                    salable.setShirtNum(shirtNum);
                    salable.setTeam(details.getTeamName());
                    details.buyingPlayer(salable);
                    
                    details.setMoney(value);
                    printer.printMoney(details);

                } else
                {
                    printer.printMoney();
                }
            } 
        }
    }
    
    public void hiringCoach(Coach[] coaches, Team details){
        
        UserInterface print = new UserInterface();
        Scanner sc = new Scanner(System.in);
        String surname;
        Coach hired = null;
        int wage;
        
        print.hiringPrint();
        surname = sc.nextLine();
        
        for (Coach manager: coaches) {
            if(manager.getSurname().contains(surname))
            {
                hired = manager;
                break;
            }
        }
        
        if (hired == null){
            print.hiringPrint(1,surname,hired);
        } else
        {
            print.hiringPrint(2,surname,hired);
            String ans = sc.nextLine();
            if(ans.equals("y")){
                wage = hired.getWage(); 
                
                if(details.getMoney() >= hired.getWage()){
                    details.hiringCoach(hired);
                    details.setMoney(wage);
                    print.printMoney(details);
                } else
                {
                    print.printMoney();
                }
            }
        }
    }
    
    public void rentingArena(Arena[] arenas,Team details){
        
        UserInterface print = new UserInterface();
        Arena forRent = null;
        Scanner sc = new Scanner(System.in);
        
        print.rentingPrint();
        String arenaName = sc.nextLine();
        
        
        for (Arena gym: arenas) {                       
            if(gym.getNameAr().contains(arenaName))
            {
                forRent = gym;
                break;
            }
        }
        if (forRent == null){                            
            print.rentingPrint(1, arenaName, forRent);    
        } else
        {
            print.rentingPrint(2,arenaName,forRent);     
            
            if(forRent.getAvailable()){
                
                print.rentingPrint(3,arenaName,forRent);
                String ans = sc.nextLine();
                
                if(ans.equals("y")){
                    int rentValue = forRent.getRentValue();
                
                    if(details.getMoney() >= forRent.getRentValue()){
                        details.rentingArena(forRent);
                        details.setMoney(rentValue);
                        print.printMoney(details);
                    } else
                    {
                        print.printMoney();
                    }
                }
            } else
            {
                print.rentingPrint(4, arenaName, forRent);
            }
        }
    }
}
