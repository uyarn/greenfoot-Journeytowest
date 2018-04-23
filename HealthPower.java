import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPower extends Actor implements State
{
    /**
     * Act - do whatever the HealthPower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void healthControl(Actor bulletEnemy,Actor enemy,Actor enemy_touch,Player player){
    //    Actor enemy_touch = getOneIntersectingObject(Enemy.class);
                if(enemy_touch != null){
                    player.getWorld().removeObject(enemy_touch);
                }
    }
}
