import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class user1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class user1 extends PickRoles
{
    /**
     * Act - do whatever the user1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()
    {
        // Add your action code here.
        if ( Greenfoot.isKeyDown("left") ){
            move(-18);
        }
        if ( Greenfoot.isKeyDown("right") ){
            move(18);
        }
        if ( Greenfoot.isKeyDown("enter") ){

            MyWorld world = (MyWorld) getWorld();
            
            if(isTouching(Monkey.class)){
                removeTouching(Monkey.class);
               
                getWorld().removeObject(this);
                 world.statusChoice();
            }
            else{
              if(isTouching(Pig.class)){
                  removeTouching(Pig.class);
                  
                  getWorld().removeObject(this);
                  world.statusChoice();
              }
              else{
                if(isTouching(Sandy.class)){
                    removeTouching(Sandy.class);
                   getWorld().removeObject(this);
                   world.statusChoice();
                }
              }
            }
            

        }
    }
}
