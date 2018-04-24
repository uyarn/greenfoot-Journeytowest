import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Bananas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bananas extends items
{
    /**
     * Act - do whatever the Bananas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bananas()
    {
      
       GreenfootImage image = getImage();
       image.scale(40,40);
       setImage(image);
    
    }
    public void add(items item){
        // error operation
    }
    public void remove(items item){
        // error operation
    }  
    public List<items> getChild(){
      return null;   
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
