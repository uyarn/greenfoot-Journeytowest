import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Bag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bag extends Actor
{
    /**
     * Act - do whatever the Bag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static List<items> items = new ArrayList<items>();
    
    private Bag()
    {
       GreenfootImage image = getImage();
       image.scale(50,50);
       setImage(image);
       items = null;
    }
    
    public static List<items> getItemsLists()
    {
        return items;
    }
    
    public static void add(items item)
    {   items = Bag.getItemsLists();
        items.add(item);
    }
    public static void remove(items item)
    {   items = Bag.getItemsLists();
        items.remove(item);
    }
    public static void print_lists(){
        items = Bag.getItemsLists();
       System.out.println(items.size());
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
