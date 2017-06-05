package gui;

import basketball.MyTeam;
import exceptions.InputExc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicalInterface extends JFrame {
    
    private JFrame f;
    private JPanel p;
    private JPanel p2;
    private JButton nameButton;
    private JButton moneyButton;
    private JLabel lab;
    
    public GraphicalInterface(){
        gui();
    }
    
    private void gui(){
        f = new JFrame("Basketball team");
        f.setSize(400,400);
        f.setLayout(new GridLayout(3, 1));
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                f.dispose();
            }        
        }); 
        
        p = new JPanel();
        //p.setLayout(new GridLayout(4,1,2,2));
   
        p.setBackground(Color.GRAY);
        lab = new JLabel("", JLabel.CENTER);
        p2 = new JPanel();
        //p.setLayout(new GridLayout(4,1,2,2));
        p2.setBackground(Color.GRAY);
        f.add(lab);
        f.add(p);
        f.add(p2);
        f.setVisible(true);
    }
    
    public void showTextField(MyTeam details){
        lab.setText("Enter your team's name and money");
        JLabel nameLabel = new JLabel("Team name : ",JLabel.CENTER);
        JLabel moneyLabel = new JLabel("Money: ",JLabel.CENTER);
        final JTextField teamName = new JTextField(6);
        final JTextField money = new JTextField(6);
        JLabel finalName = new JLabel();
        finalName.setBounds(100,100,100,100);
        JLabel finalMoney = new JLabel();
        finalMoney.setBounds(100,100,100,100);
        nameButton = new JButton("Enter");
        nameButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String name;
            //name = enterTeamName(name);
            try {
                if (teamName.getText().matches(".*\\d.*") && teamName.getText() != null)
                {
                    throw new InputExc("Wrong input. You need to enter name which contains letters");
                } else{
                    name = teamName.getText();
                    details.setTeamName(name);
                    finalName.setText("Your team name: " + name);
                }   
            } catch (InputExc ex) {
                lab.setText("Message: " + ex.getMessage() + "!!!");
            }
            
         }
        }); 
        moneyButton = new JButton("Enter");
        moneyButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String mn;
            try {
                if(!isNumeric(money.getText()))
                   throw new InputExc("Wrong input. You need to enter number.");
                else 
                    mn = money.getText();
                    long mnInt = Long.parseLong(mn);
                    details.setFirstMoney(mnInt);
                    finalMoney.setText("Your team money: " + mn);
                    
                    lab.setText("Enter your team's name and money");
            } catch(InputExc exc) {
                lab.setText("Message: " + exc.getMessage() + "!!!");
            }
         
         }
        }); 
        p.add(nameLabel);
        p.add(teamName);
        p.add(nameButton);
        p.add(finalName);
        p2.add(moneyLabel);
        p2.add(money);
        p2.add(moneyButton);
        p2.add(finalMoney);
        f.setVisible(true);
    }
        
        public boolean isNumeric(String s) {  
            return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
        }  
}
