import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class updownCloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class updownCloud extends Floor
{
    /**
     * Act - do whatever the updownCloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int up;
    private int down;
    public updownCloud(int u, int d, int s){
       speed = s;
       up = u;
       down = d;
    
    }
    
    public void act() 
    {
        // Add your action code here.
        if ( (speed > 0 && getY() >= down) ||
        (speed < 0 && getY() <= up) )
            {
                speed = -speed;
      }
        setLocation(getX(),getY()+speed);
       
    }  
}
