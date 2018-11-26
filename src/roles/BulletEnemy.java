import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletEnemy extends Actor
{
    /**
     * Act - do whatever the BulletEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private Boolean direction;
    private int  speed;
    public boolean liveEnemyBullet;
    
    
    public BulletEnemy(Boolean dir,boolean liveEnemyBullet)
    {
        direction = dir;
        speed = 15;
        this.liveEnemyBullet=liveEnemyBullet;
    }
    
    
    public void act() 
    {
        // Add your action code here.
        // Add your action code here.
        if(direction){
          move(speed);
        }
        if(!direction){
          move(-speed);
        }
        if(isAtEdge()){
          getWorld().removeObject(this);
        }
        
        
    }    
    
    
}
