
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Boolean direction;
    private int  speed;
    public boolean live;
    
    public Bullet(){
        
    }
    
    public Bullet(Boolean dir,boolean live)
    {
        direction = dir;
        this.live=live;
    }
    
    public void act() 
    {
        // Add your action code here.
        if(direction){
          move(15);
        }
        if(!direction){
          move(-15);
        }
        if(isAtEdge()){
          getWorld().removeObject(this);
        }
        
                
    }   
    
    //角色打击敌人
    public boolean hit(Enemy enemy){
        
            if(this.intersects(enemy)){
                getWorld().removeObject(this);
                this.live=false;
                return true;
            }
            else{
                return false;
            }                    
    }
    
    //敌人打击角色
//    public void hitRole(Monkeyrole monkey){

//            if(this.intersects(monkey)){
//                monkey.health-=10;
//                System.out.println( monkey.health);
//            }
//            if(monkey.health<=0){
//                this.live=false;
 //               getWorld().removeObject(monkey);
//            }
                    
//    }
    
    
}

