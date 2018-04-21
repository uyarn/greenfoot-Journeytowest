import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends items
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bread()
    {
       GreenfootImage image = getImage();
       image.scale(50,25);
       setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
