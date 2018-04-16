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
    private int speed;
    private int right;
    private int left;
    public cloud(int r, int l, int s){
       speed = s;
       right = r;
       left = l;
    
    }
    
    public void act() 
    {
        // Add your action code here.
        if ( (speed > 0 && getX() >= right) ||
        (speed < 0 && getX() <=left) )
            {
                speed = -speed;
      }
        move(speed);
       
    }    
}
