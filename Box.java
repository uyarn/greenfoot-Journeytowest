import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends items
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static List<items> itemInBox = new ArrayList<items>();
    public Box()
    {
       GreenfootImage image = getImage();
       image.scale(35,35);
       setImage(image);
    }
    public void add(items item){
       itemInBox.add(item);
       ;
    }
    public void remove(items item){
       
    }  
    public List<items> getChild(){
      return itemInBox;   
    }
    public void act() 
    {
       
    }    
}
