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
    
    public  Boolean leftright=true;
    SingletonBags bag = SingletonBags.getInstance();
    
    public void act() 
    {
        
        // to collect the items touched by players
        
        
        if(isTouching(items.class)){
           if(getOneIntersectingObject(items.class) instanceof Box){
             Box aBox =(Box) getOneIntersectingObject(items.class);
               bag.add(aBox);
               getWorld().removeObject(getOneIntersectingObject(items.class));
            }
            else{
               if(getOneIntersectingObject(items.class) instanceof Shelf){
                    Shelf aShelf = (Shelf) getOneIntersectingObject(items.class);
                    bag.add(aShelf);
                    getWorld().removeObject(getOneIntersectingObject(items.class));
                   
                }
                else{
                 int bagSize=bag.getChild().size();
    
                 if(bagSize!=0){  
                     // book types
                  if(getOneIntersectingObject(items.class) instanceof Couplet||
                    getOneIntersectingObject(items.class) instanceof Scripture){
                      items touchItem=(items) getOneIntersectingObject(items.class);
                      int index=-1;
                      for(int i=0;i<bag.getChild().size();i++){
                          if(bag.getChild().get(i) instanceof Shelf){
                               index=i;
                               break;
                            }
                        }
                       if(index!=-1){
                          Shelf existShelf = (Shelf) bag.getChild().get(index);
                          existShelf.add(touchItem);
                           getWorld().removeObject(getOneIntersectingObject(items.class));
                        }
                      
                       
                    }
                    // food types
                   else{
                      items touchItem=(items) getOneIntersectingObject(items.class);
                      int index=-1;
                      for(int i=0;i<bag.getChild().size();i++){
                          if(bag.getChild().get(i) instanceof Box){
                               index=i;
                               break;
                            }
                        }
                       if(index!=-1){
                          Box existBox = (Box) bag.getChild().get(index);
                          existBox.add(touchItem);
                          getWorld().removeObject(getOneIntersectingObject(items.class));
                        }
                       
                       
                 
                    }
                  
                  
                 
                 
                }
                }
               
            }
           
        }
        
        
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
        


