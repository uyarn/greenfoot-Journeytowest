import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tang extends Actor
{
    /**
     * Act - do whatever the tang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private SimpleTimer timer = new SimpleTimer();
    //private int LiveTime = 1000;
     private int LiveTime = 60000;
     public boolean done =false;
    public tang(){
        
        GreenfootImage image = getImage();  
        image.scale(60, 60); 
        setImage(image);
        timer.mark();
        
    
    }
    public void act() 
    {
        // Add your action code here.
        if(!isTouching(Floor.class)){
        setLocation(getX(),getY()+4);
        turn(4);
        }
    if( timer.millisElapsed()>LiveTime*2){
          removeTouching(Floor.class);
          
          
        }
        if(isAtEdge()){
           Scenario1 world = (Scenario1) getWorld();
           world.GameOver();
        }
        if(isTouching(Player.class)){
          SingletonBags bag = SingletonBags.getInstance();
          if(bag.getChild().size()==2){
              if(bag.getChild().get(0) instanceof Box){
                   Box hasBox =(Box) bag.getChild().get(0);
                   Shelf hasShelf = (Shelf) bag.getChild().get(1);
                   if(hasBox.getChild().size()==2&&hasShelf.getChild().size()==3){
                     done=true;
                    }
                }
                else{
                Box hasBox =(Box) bag.getChild().get(1);
                   Shelf hasShelf = (Shelf) bag.getChild().get(0);
                   if(hasBox.getChild().size()==2&&hasShelf.getChild().size()==3){
                     done=true;
                    }
                }
             
            }
           if(done){
               Scenario1 sc = (Scenario1) getWorld();
               sc.GameFinish();
            }
        }
    }    
}
