import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fire extends Obstacle
{
    /**
     * Act - do whatever the fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public fire (){
     GreenfootImage image = getImage();  
        image.scale(40, 40); 
        setImage(image);
    
    }
    public void act() 
    {
        // Add your action code here.
        turn(4);
    }    
}
