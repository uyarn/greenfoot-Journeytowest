import greenfoot.*; 
/**
 * Write a description of class SmallEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallEnemy extends Enemy 
{
    
    private int temp = 0;
    int left2 = this.getRandomNumber(0,1020);
    int right2 = this.getRandomNumber(left2+1,1024);
    
    public SmallEnemy(int left,int right)
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
            move(speed);
            
        }
        else if(speed > 0 && getX() == right)
        {
            speed = -1;
            move(speed);
            temp = temp+1;
        }
        else if(speed < 0 && getX() > left)
        {
            speed = -1;
            move(speed);
            
        }
        else if(speed < 0 && getX() == left)
        {
            speed = 1;
            move(speed);
            temp = temp+1;
        }
        if(temp > 1)
        {
            HP = HP - 10;
            
        }
       
    }
    
    public Enemy clone()
    {
        
        if(left2 < right2)
        {
            Enemy enemy = new SmallEnemy(left2,right2);
            return enemy;
        }
        else
        {
            Enemy enemy = new SmallEnemy(left2,right2);
            return enemy;
        }   
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
