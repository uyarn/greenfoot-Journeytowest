import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scenario1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scenario1 extends World
{

    /**
     * Constructor for objects of class Scenario1.
     * 
     */
    public Scenario1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 489, 1); 

        setBackground("dark1.jpg");
        act();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bricks bricks = new bricks();
        addObject(bricks,22,488);
        bricks.setLocation(17,480);
        bricks bricks2 = new bricks();
        addObject(bricks2,56,487);
        bricks2.setLocation(51,480);
        bricks2.setLocation(48,480);
        bricks bricks3 = new bricks();
        addObject(bricks3,86,487);
        bricks3.setLocation(80,481);
        bricks bricks4 = new bricks();
        addObject(bricks4,119,487);
        bricks4.setLocation(111,481);
        cloud cloud = new cloud();
        addObject(cloud,305,359);
        cloud.setLocation(182,350);
        cloud.setLocation(169,469);
        bricks bricks5 = new bricks();
        addObject(bricks5,344,435);
        bricks bricks6 = new bricks();
        addObject(bricks6,297,374);
        bricks bricks7 = new bricks();
        addObject(bricks7,252,318);
        fire fire = new fire();
        addObject(fire,416,226);
        fire.setLocation(313,318);
    }
}
