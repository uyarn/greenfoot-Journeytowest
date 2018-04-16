import greenfoot.*;
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy 
{
    // instance variables - replace the example below with your own
    private int rate = 0;
    /**
     * Constructor for objects of class Boss
     */
    public Boss(int left,int right)
    {
        this.left = left;
        this.right = right;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void act()
    {
        if(speed > 0 && getX() < right)
        {
            move(speed);
            shooter();
        }
        else if(speed > 0 && getX() == right)
        {
            speed = -1;
            move(speed);
            shooter();
        }
        else if(speed < 0 && getX() > left)
        {
            speed = -1;
            move(speed);
            shooter();
        }
        else if(speed < 0 && getX() == left)
        {
            speed = 1;
            move(speed);
            shooter();
        }
    }
    
    public Enemy clone()
    {
        return null;
    }
    
    public void shooter()
    {   
        rate++;
        World w = getWorld();
        EnemyBullet bullet = new EnemyBullet(speed);
        if(rate%25 == 0)
        {
            w.addObject(bullet,getX(),getY());
        }
        
    }
}
