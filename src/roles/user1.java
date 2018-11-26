import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class user1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class user1 extends PickRoles implements UserSwapWorld
{
    /**
     * Act - do whatever the user1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   UserWorldAdapter userCallWorld;
   public user1(){
        GreenfootImage image = getImage();  
        image.scale(30, 30); 
        setImage(image);
    }
    
    // implement the userSwapWorld
    public void trySwapWorld(String str,int position){
        
      userCallWorld = new UserWorldAdapter();
      userCallWorld.trySwapWorld(str,position);
    }
    
    
    
   public void act()
    {
        // Add your action code here.
        if ( Greenfoot.isKeyDown("left") ){
            move(-18);
        }
        if ( Greenfoot.isKeyDown("right") ){
            move(18);
        }
        if ( Greenfoot.isKeyDown("down") ){
            if(isTouching(Monkey.class)){
                removeTouching(Monkey.class);
               
                getWorld().removeObject(this);
                trySwapWorld("M",0);
            }
            else{
              if(isTouching(Pig.class)){
                  removeTouching(Pig.class);
                  
                  getWorld().removeObject(this);
                  trySwapWorld("P",0);
              }
              else{
                if(isTouching(Sandy.class)){
                    removeTouching(Sandy.class);
                   getWorld().removeObject(this);
                   trySwapWorld("S",0);
                }
              }
            }
        }
           // if (isTouching(items.class))
            //{
                //items item = (items)getOneIntersectingObject(items.class);
                //Bag.add(item);
                //Bag.print_lists();
               // removeTouching(items.class);
             //   getWorld().removeObject(item);    
           // } 
            
   
        }
}
