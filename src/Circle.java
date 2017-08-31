/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Point;
import javax.swing.JPanel;
/**
 *
 * @author Shaun
 */
public class Circle extends JPanel
{
    int x;
    int y;
    double radius;
    
    
    public Circle(Point center,int radius)
    {
    this.x = center.x;
    this.y = center.y;
    this.radius = radius;
    }
    
    public Point getCenter()
    {
        Point center = new Point(this.x,this.y);
        return center;
    }  
    
    public double getRadius()
    {
    return this.radius;
    }
    
    public double getArea()
    {
     return Math.PI*this.radius*this.radius;
    
    }
    
    public double getCircumference()
    {
    return 2*Math.PI*this.radius;
    }
    
    @Override
    public String toString()
    {
       
        return "Circle[center=(),radius="+radius+"]";
    }
    
    public void draw(Graphics g)
{
   g.drawLine(0, 0, 100, 100);
   repaint();
}
    
    
    @Override
   public boolean contains(Point p)
    {
        return Math.sqrt(Math.pow(this.x-p.x,2)+ Math.pow(this.y-p.y,2)) < this.radius;
    }
  
  
  
}

