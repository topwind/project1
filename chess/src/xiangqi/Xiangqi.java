/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xiangqi;
import java.awt.*;
import javax.swing.*;
import sun.java2d.loops.DrawLine;
/**
 *
 * @author Fengxiyuan
 */
public class Xiangqi extends JFrame{
public void paint(Graphics g){
      int p=50;
      int i;
      for (i=1;i<=10;i++)
      { 
          g.drawLine(50,p ,450 ,p );
          p=p+50;
      }
      g.drawLine(50, 50, 50, 500);
      p=100;
      for (i=2;i<=9;i++)
      {
          g.drawLine(p,50,p, 250);
          p=p+50;
      }
      g.drawLine(450, 50, 450, 500);
      p=100;
      for (i=2;i<=9;i++)
      {
          g.drawLine(p,300,p, 500);
          p=p+50;
      }
      g.drawLine(200, 50, 300, 150);
      g.drawLine(300, 50, 200, 150);
      g.drawLine(200, 500, 300, 400);
      g.drawLine(300, 500, 200, 400);
      g.drawLine(97, 140, 97, 147);
      g.drawLine(90, 147, 97, 147);
      g.drawLine(103,160,103,153);
      g.drawLine(110, 153, 103, 153);
      g.drawLine(90, 153,97 , 153);
      g.drawLine(97,153,97,160);
      g.drawLine(103, 147, 103, 140);
      g.drawLine(103, 147, 110, 147);
      g.drawLine(397, 140, 397, 147);
      g.drawLine(390, 147, 397, 147);
      g.drawLine(403,160,403,153);
      g.drawLine(410, 153, 403, 153);
      g.drawLine(390, 153,397 , 153);
      g.drawLine(397,153,397,160);
      g.drawLine(403, 147, 403, 140);
      g.drawLine(403, 147, 410, 147);
      
      g.drawLine(97, 390, 97, 397);
      g.drawLine(90, 397, 97, 397);
      g.drawLine(103,410,103,403);
      g.drawLine(110, 403, 103, 403);
      g.drawLine(90, 403,97 , 403);
      g.drawLine(97,403,97,410);
      g.drawLine(103, 397, 103, 390);
      g.drawLine(103, 397, 110, 397);
      
      g.drawLine(397, 390,397, 397);
      g.drawLine(390, 397, 397, 397);
      g.drawLine(403,410,403,403);
      g.drawLine(410, 403, 403, 403);
      g.drawLine(390, 403,397 , 403);
      g.drawLine(397,403,397,410);
      g.drawLine(403, 397, 403, 390);
      g.drawLine(403, 397, 410, 397);
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Xiangqi frame=new Xiangqi();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//1
        frame.setSize(800,600); //2
        JLabel lab1=new JLabel("楚河");
        lab1.setLocation(100, 275);
        frame.add(lab1);
        frame.setVisible(true);
    }
}
