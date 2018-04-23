import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Firefull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firefull extends Actor implements Strategy
{
    /**
     * Act - do whatever the Firefull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     World w;
     
    public Firefull(){
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void fire(Player player){
        Bullet bullet = new Bullet(player.leftright,true);
         Bullet bullet2 = new Bullet(player.leftright,true);
         Bullet bullet3 = new Bullet(player.leftright,true);
         Bullet bullet4 = new Bullet(player.leftright,true);
         

         if(player.leftright==true){
             bullet2.setRotation(-30);
             bullet3.setRotation(-120);
             bullet4.setRotation(-180);
             
         }
         else{
             bullet2.setRotation(30);
             bullet3.setRotation(120);
             bullet4.setRotation(180);
         }
         
        w =player.getWorld();
         
        w.addObject(bullet, player.getX(),player.getY());
        w.addObject(bullet2, player.getX(),player.getY());         
        w.addObject(bullet3,  player.getX(),  player.getY());
        w.addObject(bullet4,  player.getX(), player. getY());
    }
}
