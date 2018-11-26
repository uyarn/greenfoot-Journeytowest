import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Doublefire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doublefire extends Actor implements Strategy
{
    /**
     * Act - do whatever the Doublefire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    World w;
    
    public Doublefire(){
    }
    
    public void act() 
    {
        // Add your action code here.        
    }    
    
    public void fire(Player player){
        Bullet bullet = new Bullet(player.leftright,true);
        Bullet bullet2 = new Bullet(player.leftright,true);

         if(player.leftright==true){
             bullet.setRotation(-30);
         }
         else{
             bullet.setRotation(30);
         }
       
        
        w =player.getWorld();
         
        w.addObject(bullet, player.getX(),player.getY());
        w.addObject(bullet2, player.getX(),player.getY());
    }
}
