import javax.swing.*;
import java.awt.event.*;

public class Iconsbutton extends JButton{
    public Iconsbutton(Icon icon, Icon pressed, Icon rollover){
    super(icon);
    
    setFocusPainted(false);
    setRolloverEnabled(true);
    setRolloverIcon(rollover);
    setPressedIcon(pressed);
    setBorderPainted(false);
    setContentAreaFilled(false);
}
          public static void main(String args[]){
          
          Iconsbutton b1 =  new Iconsbutton (
          new imageIcon("keyboard/walum.jpg"),
          new imageIcon("keyboard/cat.jpg"),
          new imageIcon("keyboard/walum.jpg"));
           
          Iconsbutton b2 =  new Iconsbutton ( 
          new imageIcon("keyboard/b1.gif"),         
          new imageIcon("keyboard/cat.jpg"),
          new imageIcon("keyboard/b1.gif"));
 
          JFrame box = new JFrame();
          box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          Container c = box.getContentPane();
          c.setLayout(new FowLayout());
          c.add(b1);
          c.add(b2);
          box.pack();
          box.setVisible(true);
 }
}