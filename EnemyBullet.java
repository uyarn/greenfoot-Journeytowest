import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 0;
    public EnemyBullet(int speed){
        this.speed = speed;
    }
    public void act() 
    {
        // Add your action code here.
        World w = getWorld();
        move(speed*5);
        if(isAtEdge())
        {
            w.removeObject(this);
        }
    }    
}
