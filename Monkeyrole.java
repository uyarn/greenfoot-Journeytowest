import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkeyrole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkeyrole extends player
{
    /**
     * Act - do whatever the Monkeyrole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    private Boolean role;
    private Boolean leftright;
    private boolean upIsDown;
    private boolean enterIsDown;
    
    private boolean wIsDown;
    
    private Scenario1 sce;
    public int health;
    
    //无敌的时间
    private int timer = 10000;
    //角色的状态
    private boolean status=true;
    
    
    public Monkeyrole(Boolean dicision,Scenario1 sce,int health)
    {
        this.role = dicision;
        this.sce=sce;
        this.health=health;
    }
    
    
    public void act() 
    {
        // Add you
        super.act();
        if(role){
            if(Greenfoot.isKeyDown("Left") ){
               move(-4);
               leftright=false;
               setImage("monkeyStandL1.png");
            }
        
            if( Greenfoot.isKeyDown("Right")){
                move(4);
                leftright=true;
                setImage("monkeyStandR1.png");
            }
            
             if (!upIsDown && Greenfoot.isKeyDown("Up")){
            
               upIsDown = true;
             }
             if (upIsDown && !Greenfoot.isKeyDown("Up")){
           
                upIsDown = false;
                if(isTouching(Floor.class)){
                     setLocation(getX(),getY()-50);
                }
                
             } 
             
             
             if (!enterIsDown && Greenfoot.isKeyDown("Enter")){
            // do whatever when escape key is down
                  enterIsDown = true;
             }
             if (enterIsDown && !Greenfoot.isKeyDown("Enter")){
            // do whatever when escape key is released
               enterIsDown = false;
               fire();

             } 
        }
        
        
        
        //第二种状态
        if(!role){
             if(Greenfoot.isKeyDown("A") ){
                move(-4);
                leftright=false;
                setImage("monkeyStandL1.png");
             }
        
            if( Greenfoot.isKeyDown("D")){
                move(4);
                leftright=true;
                setImage("monkeyStandR1.png");
            }
            
            if (!wIsDown && Greenfoot.isKeyDown("W")){
            
               wIsDown = true;
             }
             if (wIsDown && !Greenfoot.isKeyDown("W")){
           
                wIsDown = false;
                 if(isTouching(Floor.class)){
                     setLocation(getX(),getY()-50);
                }
             } 
             
             if (!enterIsDown && Greenfoot.isKeyDown("T")){
            // do whatever when escape key is down
                  enterIsDown = true;
             }
             if (enterIsDown && !Greenfoot.isKeyDown("T")){
            // do whatever when escape key is released
               enterIsDown = false;
               fire();
            //   Bullet bullet = new Bullet(leftright);
            //   getWorld().addObject(bullet, getX(), getY());

             } 
             
            
        }
        
        this.healthCount();
        
        if(this!=null){
            status();
        }
       
        
        
        
       
        
    }    
    
    
    private void status(){
        if(this.health<20&&this.health>0){
            this.status=false;
            if (timer>0)
            {
                Actor enemy_touch = getOneIntersectingObject(Enemy.class);
                if(enemy_touch != null){
                    getWorld().removeObject(enemy_touch);
                }
                timer=timer-60;
                if(timer == 0) {
                    this.status=false;
                    return;
                }
            }
        }
    }
    
    
    private void healthCount(){
        Actor bulletEnemy = getOneIntersectingObject(BulletEnemy.class);
        
        Actor enemy = getOneIntersectingObject(Enemy.class);
        
        if(enemy!=null&&this.status==true){
            getWorld().removeObject(this);
        }
         
        if (bulletEnemy != null)
            {
                getWorld().removeObject(bulletEnemy);
                if ((health -= 10) <= 0) getWorld().removeObject(this);
            }
    }
    //角色开火
    private void fire(){
         Bullet bullet = new Bullet(leftright,true);
         sce.bullets.add(bullet);
//         System.out.println(sce.bullets.size());
         getWorld().addObject(bullet, getX(), getY());
    }
    
    
    
}
