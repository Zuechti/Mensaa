import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03.11.2016
 * @author 
 */

public class gui extends JFrame {
    // Anfang Attribute
    private JTextArea jTextArea1 = new JTextArea();
    private Label label1 = new Label();
    private Button button1 = new Button();
    private Label label2 = new Label();
    private Button button2 = new Button();
    private Button button3 = new Button();
    private Button button4 = new Button();
    private Button button5 = new Button();
    private Button button6 = new Button();
    private Button button7 = new Button();
    private Button button8 = new Button();
    private Button button9 = new Button();
    private Cafeteria c;
    private boolean foodr;
    private boolean dessertr;
    // Ende Attribute

    public gui(Cafeteria c) {

        // Frame-Initialisierung
        super("Cafeteria");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 456; 
        int frameHeight = 367;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);

        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten
        this.c=c;

        jTextArea1.setBounds(16, 32, 353, 49);
        jTextArea1.setEditable(false);
        cp.add(jTextArea1);
        jTextArea1.setEditable(false);

        label1.setBounds(16, 8, 355, 17);
        label1.setText("Bestellungen");
        cp.add(label1);

        cp.add(button1);
        label2.setBounds(16, 144, 355, 25);
        label2.setText("Ausgabe");
        cp.add(label2);
        button2.setBounds(16, 176, 97, 65);
        button2.setLabel("Schnitzel");
        button2.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button2_ActionPerformed(evt);
                }
            });
        cp.add(button2);
        button3.setBounds(120, 176, 97, 65);
        button3.setLabel("Bratkartoffeln");
        button3.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button3_ActionPerformed(evt);
                }
            });
        cp.add(button3);
        button4.setBounds(224, 176, 97, 65);
        button4.setLabel("Salat");
        button4.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button4_ActionPerformed(evt);
                }
            });
        cp.add(button4);
        button5.setBounds(328, 176, 97, 65);
        button5.setLabel("Omlette");
        button5.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button5_ActionPerformed(evt);
                }
            });
        cp.add(button5);
        button6.setBounds(16, 248, 97, 65);
        button6.setLabel("Eis");
        button6.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button6_ActionPerformed(evt);
                }
            });
        cp.add(button6);
        button7.setBounds(120, 248, 97, 65);
        button7.setLabel("Fruchtquark");
        button7.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button7_ActionPerformed(evt);
                }
            });
        cp.add(button7);
        button8.setBounds(224, 248, 97, 65);
        button8.setLabel("Joghurt");
        button8.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button8_ActionPerformed(evt);
                }
            });
        cp.add(button8);
        button9.setBounds(328, 248, 97, 65);
        button9.setLabel("Vla");
        button9.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    button9_ActionPerformed(evt);
                }
            });
        cp.add(button9);
        // Ende Komponenten

        setVisible(true);
        jTextArea1.setText(c.getNextVictim().Order());
    } // end of public gui

    // Anfang Methoden
    public void updateText(){
        if(c.getNextVictim()!=null){
            jTextArea1.setText(c.getNextVictim().Order());
        }
        else{
            jTextArea1.setText("Gewonnen?");
        }
    }

    public void button2_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
            if(c.giveFood(1)){
                foodr=true;
                if(foodr&&dessertr){
                    c.nextPlease();
                    foodr=false;
                    dessertr=false;
                    updateText();
                }
            }
            else
                foodr=false;
    } // end of button2_ActionPerformed

    public void button3_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
        if(c.giveFood(2)){
            foodr=true;
            if(foodr&&dessertr){
                c.nextPlease();
                foodr=false;
                dessertr=false;
                updateText();
            }
        }
        else
            foodr=false;
    } // end of button3_ActionPerformed

    public void button4_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
        if(c.giveFood(3)){
            foodr=true;
            if(foodr&&dessertr){
                c.nextPlease();
                foodr=false;
                dessertr=false;
                updateText();
            }
        }
        else
            foodr=false;
    } // end of button4_ActionPerformed

    public void button5_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
        if(c.giveFood(4)){
            foodr=true;
            if(foodr&&dessertr){
                c.nextPlease();
                foodr=false;
                dessertr=false;
                updateText();
            }
        }
        else
            foodr=false;
    } // end of button5_ActionPerformed

    public void button6_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
        if(c.giveDessert(1)){
            dessertr=true;
            if(foodr&&dessertr){
                c.nextPlease();
                foodr=false;
                dessertr=false;
                updateText();
            }
        }
        else
            dessertr=false;
    } // end of button6_ActionPerformed

    public void button7_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
        if(c.giveDessert(3)){
            dessertr=true;
            if(foodr&&dessertr){
                c.nextPlease();
                foodr=false;
                dessertr=false;
                updateText();
            }
        }
        else
            dessertr=false;
    } // end of button7_ActionPerformed

    public void button8_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
        if(c.giveDessert(2)){
            dessertr=true;
            if(foodr&&dessertr){
                c.nextPlease();
                foodr=false;
                dessertr=false;
                updateText();
            }
        }
        else
            dessertr=false;
    } // end of button8_ActionPerformed

    public void button9_ActionPerformed(ActionEvent evt) {
        if(c.getNextVictim()!=null)
        if(c.giveDessert(4)){
            dessertr=true;
            if(foodr&&dessertr){
                c.nextPlease();
                foodr=false;
                dessertr=false;
                updateText();
            }
        }
        else
            dessertr=false;
    } // end of button9_ActionPerformed

    // Ende Methoden
} // end of class gui
