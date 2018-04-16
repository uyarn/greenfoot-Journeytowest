import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int roleChoice = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1);
        setBackground("background1.jpg");
        prepare();
    }
    
    
    public void statusChoice(){
      this.roleChoice+=1;
      if(this.roleChoice==2){
        List objects = getObjects(null);
        removeObjects(objects);
        Scenario1 dark = new Scenario1();
         Greenfoot.setWorld(dark);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Monkey m = new Monkey();
        addObject(m,135,275);
        Pig p = new Pig();
        addObject(p,265,275);
        Sandy s = new Sandy();
        addObject(s,395,275);
        user1 user1 = new user1();
        addObject(user1,62,263);
        user2 user2 = new user2();
        addObject(user2,70,303);
    }
}
