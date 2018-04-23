import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Bags here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SingletonBags extends items
{
    /**
     * Act - do whatever the Bags wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static List<items> items = new ArrayList<items>();
    // Singleton instance Method
    private static SingletonBags instance;
    private SingletonBags (){}
    
   public static SingletonBags getInstance(){
      return instance;
   }
    // add items methods
    public void add(items item){
    
    }; 
    // remove items methods
    public void remove(items item){
    
    }; 
    
    public items getChild(int i){
      return null;
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
