
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shaun
 */
public class PracticeIt 
{
 public static void main(String[] args) throws IOException
    {
    JFrame frame = new JFrame();
      frame.setSize(500,500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);    
      Circle circle = new Circle(new Point(4,4),5);
      frame.add(circle);
      
    }    
}
