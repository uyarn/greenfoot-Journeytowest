import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World implements WorldSwapWorld
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public static int roleChoice = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x350 cells with a cell size of 1x1 pixels.
        super(600, 350, 1);
        setBackground("background1.jpg");
        prepare();
    }
    public void worldSwapWorld(){
      System.out.println("test");
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
        Monkey monkey = new Monkey();
        addObject(monkey,172,290);
        Pig pig = new Pig();
        addObject(pig,298,290);
        Sandy sandy = new Sandy();
        addObject(sandy,422,291);
        user1 user1 = new user1();
        addObject(user1,72,280);
        user2 user2 = new user2();
        addObject(user2,72,306);

        // Set the position of the Role choice
        
        
    }
}
