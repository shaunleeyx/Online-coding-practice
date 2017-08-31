package CrittersPackage;


import CrittersPackage.Critter;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shaun
 */
public class Rabbit extends Critter 
{
    int counter = 1;
    private boolean ateFoodAlready = false;
    public Rabbit()
    {
         ateFoodAlready = false;   
    }
    
     public boolean eat() 
     {
        
        ateFoodAlready = !ateFoodAlready;
        return ateFoodAlready;
    }
    
    public Color getColor() 
    {
        return Color.DARK_GRAY;    
    }
    
    public Attack fight(String opponent)
    {
        if (opponent.equals("L"))
        {
            return Attack.SCRATCH;
        }
        else
        {
            return Attack.ROAR;
        }
    }
    
    @Override
    public Direction getMove() {
       
        
      switch(counter)
      {
          
           case 2: return Direction.NORTH;
           case 3: return Direction.SOUTH;
           case 4: return Direction.SOUTH;
           case 5: return Direction.EAST;
           case 6: return Direction.EAST;
           case 7: counter = 1;
           default: return Direction.NORTH;
          
      }
         
          
     
       
       
      
      
             
            
             
        
    }
    
    @Override
    public String toString() {
        return "V";
    }
    
}
