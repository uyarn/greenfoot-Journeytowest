import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud extends Floor
{
    /**
     * Act - do whatever the cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3;
    
    public void act() 
    {
        // Add your action code here.
        if ( (speed > 0 && getX() >= 300) ||
        (speed < 0 && getX() <=169) )
            {
                speed = -speed;
     }
        move(speed);
       
    }    
}
