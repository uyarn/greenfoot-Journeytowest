import greenfoot.*; 
/**
 * Write a description of class SmallEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallEnemy extends Enemy 
{
    
    int left2 = this.getRandomNumber(0,1020);
    int right2 = this.getRandomNumber(left2+1,1024);
    static int number = 1;
    public SmallEnemy(int left,int right)
    {
        //todo 
        this.left = left;
        this.right = right;
        speed = number;
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
            move(speed);
            
        }
        else if(speed > 0 && getX() == right)
        {
            speed = -number;
            move(speed);
        }
        else if(speed < 0 && getX() > left)
        {
            //speed = -number;
            move(speed);
            
        }
        else if(speed < 0 && getX() == left)
        {
            speed = number;
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
        
            number = number+1;
            Enemy enemy = new SmallEnemy(left2,right2);
            //enemy.speed = 2;
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
