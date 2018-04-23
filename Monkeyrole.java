import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkeyrole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkeyrole extends Player
{
    /**
     * Act - do whatever the Monkeyrole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private Boolean role;
  
    private boolean upIsDown;
    private boolean enterIsDown;
    
    private boolean wIsDown;
    
    private Scenario1 sce;
    public int health;
    
    //无敌的时间
//    private SimpleTimer timer = new SimpleTimer();
//    private int LiveTime = 1000;
    private int timer = 10000;
    
    //角色的状态
    private boolean status=true;
    private int num=1;
    
    
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
        if(isTouching(EnemyBullet.class)){
            getWorld().removeObject(getOneIntersectingObject(EnemyBullet.class)); 
            health = health - 10;
        
        } 

        
        if(Greenfoot.isKeyDown("1") ){
           num=1;
        }            
        if(Greenfoot.isKeyDown("2") ){
           num=2;
        }
        
        if(Greenfoot.isKeyDown("3") ){
           num=3;
        }
        
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
                     setLocation(getX(),getY()-40);
                }
                
             } 
             
             
             if (!enterIsDown && Greenfoot.isKeyDown("Enter")){
            // do whatever when escape key is down
                  enterIsDown = true;
             }
             if (enterIsDown && !Greenfoot.isKeyDown("Enter")){
            // do whatever when escape key is released
              enterIsDown = false;
              if(num==1){
                   Context context= new Context(new Firesingle());
                   context.operation(this);
               }
               if(num==2){
                   Context context= new Context(new Doublefire());
                   context.operation(this);
               }
               if(num==3){
                   Context context= new Context(new Firefull());
                   context.operation(this);
               }

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
                     setLocation(getX(),getY()-40);
                }
             } 
             
             if (!enterIsDown && Greenfoot.isKeyDown("T")){
            // do whatever when escape key is down
                  enterIsDown = true;
             }
             if (enterIsDown && !Greenfoot.isKeyDown("T")){
           
               enterIsDown = false;
//               fire();
               if(num==1){
                   Context context= new Context(new Firesingle());
                   context.operation(this);
               }
               if(num==2){
                   Context context= new Context(new Doublefire());
                   context.operation(this);
               }
               if(num==3){
                   Context context= new Context(new Firefull());
                   context.operation(this);
               }
             }                          
        }
        

        
        if(this!=null){
//            status();
               if(this.health<20&&this.health>0){
                   if(this.status==false){//无敌状态
                      if (timer>0){
                       timer=timer-60;
                       System.out.println(timer);
                       if(timer<=0){
                           this.status=true;
                           return;
                       }
                    }
                    }
                   else{//普通状态
                       if(timer==10000){
                           this.status=false;
                        }
                    }
             
                 
               }
            //   else{
              //     this.status=true;
              // }           
        }
        
        Actor bulletEnemy = getOneIntersectingObject(BulletEnemy.class);
              
        Actor enemy = getOneIntersectingObject(Enemy.class);
        
        Actor enemy_touch = getOneIntersectingObject(Enemy.class);
        
        StateContext sc=new StateContext(health,status,bulletEnemy,enemy,enemy_touch,this);
        sc.healthControl();
       
        if(health <=0){
            
            Scenario1 world = (Scenario1) getWorld();
            world.playerDie();
            getWorld().removeObject(this);
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
         Bullet bullet2 = new Bullet(leftright,true);
         Bullet bullet3 = new Bullet(leftright,true);
         Bullet bullet4 = new Bullet(leftright,true);
         

         if(leftright==true){
             bullet2.setRotation(-30);
             bullet3.setRotation(-120);
             bullet4.setRotation(-180);
             
         }
         else{
             bullet2.setRotation(30);
             bullet3.setRotation(120);
             bullet4.setRotation(180);
         }
         
         
//         System.out.println(sce.bullets.size());
         getWorld().addObject(bullet, getX(), getY());
         getWorld().addObject(bullet2, getX(), getY());
         getWorld().addObject(bullet3, getX(), getY());
         getWorld().addObject(bullet4, getX(), getY());
         
        
    }
    
    
    
}
