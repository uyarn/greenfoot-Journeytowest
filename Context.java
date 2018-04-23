import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Context here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Context extends Actor
{
    /**
     * Act - do whatever the Context wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        // Add your action code here.
    }   
    
    public Strategy strategy;   

    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    
    public void operation(Player player){
        
        strategy.fire(player);
    }
}
