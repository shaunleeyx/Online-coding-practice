/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shaun
 */
public class TimeSpan 
{
    
    int hour; 
    int minute;
    
    TimeSpan(int hours, int minutes)
    {
      hour = hours;
      minute = minutes;
      while(minute > 59)
      {
         minute = minute - 60;
         hour++;
      }
    }
    public int getHours()
    {
     return hour;
    }
    public int getMinutes()
    {
     return minute;
    }
    public void add(int hours, int minutes)
    {
    hour = hour + hours;
    minute = minute + minutes;
    while(minute >= 60)
      {
          minute = minute - 60;
          hour++;
      }
    
    
    }
    public void add(TimeSpan a)
    {
        hour = hour +a.hour;
        minute = minute +a.minute;
        while(minute >= 60)
      {
          minute = minute - 60;
          hour++;
      }
        
    }
    public double getTotalHours()
    {
    return hour+minute/60.0;
    }
    
    @Override
    public String toString()
    {
    return hour + "h"+minute+"m";
    }
    
    
}
