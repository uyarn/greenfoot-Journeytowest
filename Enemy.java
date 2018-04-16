import greenfoot.*;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
     int HP = 20;
     int speed = 1;
     int left;
     int right;
    public Enemy()
    {
        //todo enemy class
    }
    
    public abstract Enemy clone();
}
