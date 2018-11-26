import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Firesingle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firesingle extends Actor implements Strategy
{
    World w;
    /**
     * Act - do whatever the Firesingle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Firesingle(){
    
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void fire(Player player){
        Bullet bullet = new Bullet(player.leftright,true);
       
        
      w =player.getWorld();
         
      w.addObject(bullet, player.getX(),player.getY());
    }
}
