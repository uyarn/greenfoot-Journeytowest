import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class items extends Actor
{ 
    /**
     * Act - do whatever the items wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // add items methods
    public abstract void add(items item); 
    // remove items methods
    public abstract void remove(items item); 
    
    public abstract List<items> getChild();  
    
    public  void act() 
    {
        // Add your action code here.
    }    
}
