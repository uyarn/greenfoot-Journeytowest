import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigEnemy extends Enemy
{
    
    int left2 = this.getRandomNumber(0,1020);
    int right2 = this.getRandomNumber(left2+1,1024);
    int HP = getRandomNumber(60,120);
    //int randomSpeed = getRandomNumber(1,5);
    public BigEnemy(int left,int right)
    {
        //todo 
        this.left = left;
        this.right = right;
    }
    
    public void act()
    {
        mover();
        judge(HP);
        
    }
    
    public void mover()
    {
        if(speed > 0 && getX() < right)
        {
            //speed = randomSpeed;
            move(speed);
            
        }
        else if(speed > 0 && getX() == right)
        {
            speed = -1;
            move(speed);
        }
        else if(speed < 0 && getX() > left)
        {
            //speed = -number;
            move(speed);
            
        }
        else if(speed < 0 && getX() == left)
        {
            speed = 1;
            move(speed);
        }
        if(isTouching(Bullet.class))
        {
            getWorld().removeObject(getOneIntersectingObject(Bullet.class));
            HP = HP - 10;
            
        }
       
    }
    
    public Enemy clone()
    {
        
            Enemy enemy = new BigEnemy(left2,right2);
            return enemy;
   
    }
    
    public void judge(int HP)
    {
        World w = getWorld();
        if(HP<=0)
        {
          w.removeObject(this);
          int x = this.getRandomNumber(left2,right2);
          int y = this.getRandomNumber(0,489);
          w.addObject(this.clone(),x,y);
        }
    }
    
    public int getRandomNumber(int start,int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
}
