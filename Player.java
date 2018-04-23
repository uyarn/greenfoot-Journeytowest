import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public  Boolean leftright;
    
    public void act() 
    {
        // Add your action code here.
        if(!isTouching(Floor.class)){
         
           setLocation(getX(),getY()+4);
         
        }
        if(isTouching(updownCloud.class)){
           setLocation(getX(),getY()-2);
        }
        
        
        if(isTouching(Floor.class)){
            Floor a = (Floor) getOneIntersectingObject(Floor.class);
         if(a.getY()<getY()+20){
           setLocation(getX(),getY()+4);
         }
        }
     
          
      
// 发射子弹
       
    }
    
}
        


