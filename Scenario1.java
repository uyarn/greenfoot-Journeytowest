import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;
import java.util.List;

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
    
    
     List<Bullet> bullets=new ArrayList<Bullet>();
     static int playerStatus=2;
     SimpleTimer countTime = new SimpleTimer();
     List<BulletEnemy> enemybullets=new ArrayList<BulletEnemy>();
     Enemy enemy=new SmallEnemy(100,200);
     SingletonBags bag = SingletonBags.getInstance();
     Player play1 ;
     Player play2 ; 
//    Enemy enemy2=new Enemy();
    
   
    public Scenario1(String str[])
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 489, 1); 
        setBackground("dark1.jpg");
        countTime.mark();
        GreenfootSound backgroundMusic = new GreenfootSound("bgm.mp3");
        backgroundMusic.play();
        switch(str[0]){
          case"M":play1 =new Monkeyrole(true,this,30);break;
          case"P":play1 =new Pigrole(true,this,30);break;
          case"S":play1 =new Sandyrole(true,this,30);break;
          default:break;
        }
        switch(str[1]){
          case"M":play2 =new Monkeyrole(false,this,30);break;
          case"P":play2 =new Pigrole(false,this,30);break;
          case"S":play2 =new Sandyrole(false,this,30);break;
          default:break;
        }
        prepare();
        act();
    }
    public void playerDie(){
        playerStatus--;
        System.out.println(playerStatus);
        if(playerStatus==0){
            GameOver();
            playerStatus=2;
        }
           
    
    }
    public void GameOver(){
        showText("Game Over", 512, 244);
        
        Greenfoot.stop();
    
     }
     public void GameFinish(){
        showText("Finished!", 512, 244);
        
        Greenfoot.stop();
    
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
        cloud cloud = new cloud(400,169,2);
        addObject(cloud,305,359);
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
        fire fire2 = new fire();
        addObject(fire2,289,240);
        fire2.setLocation(269,256);
        bricks bricks9 = new bricks();
        addObject(bricks9,142,67);
        bricks bricks10 = new bricks();
        addObject(bricks10,118,74);
        bricks10.setLocation(111,67);
        bricks bricks11 = new bricks();
        addObject(bricks11,415,75);
        bricks11.setLocation(437,70);
        bricks11.setLocation(434,68);
       
        fire2.setLocation(133,110);
        fire2.setLocation(131,105);
        bricks7.setLocation(127,190);
        bricks7.setLocation(117,179);
        fire.setLocation(185,155);
        bricks6.setLocation(160,232);
        bricks5.setLocation(208,284);
        fire.setLocation(185,165);
        fire.setLocation(183,174);
        fire2.setLocation(134,115);
        cloud cloud2 = new cloud(360,204,2);
        addObject(cloud2,204,72);
        cloud2.setLocation(200,67);
        bricks bricks17 = new bricks();
        addObject(bricks17,246,288);
        bricks17.setLocation(240,284);
        bricks bricks18 = new bricks();
        addObject(bricks18,278,290);
        bricks18.setLocation(273,285);
        bricks18.setLocation(271,284);
        bricks bricks19 = new bricks();
        addObject(bricks19,309,291);
        bricks19.setLocation(302,284);

        fire fire3 = new fire();
        addObject(fire3,486,168);
        fire fire4 = new fire();
        addObject(fire4,565,163);
        fire fire5 = new fire();
        addObject(fire5,645,170);
        fire fire6 = new fire();
        addObject(fire6,718,173);
        fire3.setLocation(451,141);
        fire4.setLocation(492,142);
        fire5.setLocation(532,139);
        fire6.setLocation(644,136);
        fire5.setLocation(618,134);
        fire4.setLocation(673,137);
        fire3.setLocation(405,130);
        fire3.setLocation(400,125);
        fire fire7 = new fire();
        addObject(fire7,373,126);
        fire fire8 = new fire();
        addObject(fire8,309,145);
        fire8.setLocation(344,127);
        cloud2.setLocation(198,82);

        tang tang = new tang();
        addObject(tang,918,100);
        tang.setLocation(977,48);
        fire3.setLocation(389,103);
        fire7.setLocation(357,106);
        fire8.setLocation(325,106);
        fire5.setLocation(628,100);
        fire6.setLocation(655,101);
        fire4.setLocation(681,105);
        fire fire9 = new fire();
        addObject(fire9,301,160);
        fire9.setLocation(256,108);
        fire8.setLocation(305,109);
        fire7.setLocation(348,105);
        fire3.setLocation(390,105);
        fire8.setLocation(302,105);
        fire9.setLocation(259,105);
        fire fire10 = new fire();
        addObject(fire10,397,226);
        fire10.setLocation(221,108);
        fire9.setLocation(255,104);
        fire9.setLocation(258,105);
        fire9.setLocation(261,105);
        fire10.setLocation(219,105);
        fire3.setLocation(389,114);
        fire7.setLocation(342,116);
        fire8.setLocation(297,117);
        fire8.setLocation(301,116);
        fire9.setLocation(259,118);
        fire10.setLocation(215,117);
        tang.setLocation(987,38);
        
        
        tang.setLocation(989,28);
        tang.setLocation(989,33);
        fire4.setLocation(681,102);

       
        
        fire4.setLocation(690,101);
        fire6.setLocation(658,100);

        fire5.setLocation(628,92);
        fire4.setLocation(692,93);
        fire7.setLocation(345,115);
        

        bricks11.setLocation(439,69);
        bricks5.setLocation(209,284);
        bricks bricks31 = new bricks();
        addObject(bricks31,1016,186);
        
        bricks31.setLocation(1016,201);
        ;
        

        cloud cloud3 = new cloud(800, 692, 2);
        addObject(cloud3,692,474);
        bricks bricks38 = new bricks();
        addObject(bricks38,1018,488);
        bricks38.setLocation(1009,481);

        updownCloud updowncloud = new updownCloud(200, 450, 2);
        addObject(updowncloud,433,457);

        fire fire11 = new fire();
        addObject(fire11,718,362);
        fire11.setLocation(659,391);
        fire fire12 = new fire();
        addObject(fire12,713,400);
        fire12.setLocation(693,391);
        fire12.setLocation(691,391);
        fire11.setLocation(652,389);
        fire12.setLocation(689,389);
        fire12.setLocation(684,388);
        fire11.setLocation(652,377);
        fire12.setLocation(687,369);

        longBrick longbrick = new longBrick();
        addObject(longbrick,551,349);
        longbrick.setLocation(544,340);
        longbrick.setLocation(545,338);
        longBrick longbrick2 = new longBrick();
        addObject(longbrick2,551,273);
        longbrick2.setLocation(546,272);
        longBrick longbrick3 = new longBrick();
        addObject(longbrick3,555,205);
        longbrick3.setLocation(549,202);

        longBrick longbrick4 = new longBrick();
        addObject(longbrick4,550,420);
        longbrick4.setLocation(545,412);

        longBrick longbrick5 = new longBrick();
        addObject(longbrick5,551,486);

        longBrick longbrick6 = new longBrick();
        addObject(longbrick6,537,76);
        longbrick6.setLocation(539,69);
        removeObject(bricks19);
        removeObject(bricks18);
        removeObject(bricks17);
        removeObject(bricks5);
        longBrick longbrick7 = new longBrick();
        addObject(longbrick7,271,301);
        longbrick7.setLocation(261,292);
        longbrick7.setLocation(261,344);

        longBrick longbrick8 = new longBrick();
        addObject(longbrick8,859,272);
        longbrick8.setLocation(857,269);
        longbrick2.setLocation(539,272);
        longbrick.setLocation(559,338);
        longbrick3.setLocation(558,201);

        longBrick longbrick9 = new longBrick();
        addObject(longbrick9,925,488);
        longbrick9.setLocation(919,481);
        longBrick longbrick10 = new longBrick();
        addObject(longbrick10,88,314);
        longbrick10.setLocation(85,304);

      ;
        
        bricks6.setLocation(152,234);
        bricks7.setLocation(111,183);
        fire.setLocation(175,171);
        updownCloud updowncloud2 = new updownCloud(300, 450, 2);
        addObject(updowncloud2,971,456);
        //        player player = new player();
        //        addObject(player,303,290);
        //        player.setLocation(284,283);
        //        player.setLocation(276,284);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 以上是场景

        //addObject(enemy,300,200);
        //enemy.setLocation(384,400);
        //        addObject(enemy2,300,200);
        //        enemy2.setLocation(684,33);

        Factory factory = new Factory();
        Enemy smallenemy = factory.createEnemy(0,850,950);
        addObject(smallenemy,900,350);
        addObject(play1,80,410);
        addObject(play2,80,410);
        Bananas banana =new Bananas();
        addObject(banana,594,42);
        Couplet couple =new Couplet();
        addObject(couple ,592,172);
        Rice rice =new Rice();
        addObject(rice,570,246);
        Shelf shelf =new Shelf();
        addObject(shelf,580,304);
        Box box =new Box();
        addObject(box,115,39);
        Scripture scri = new Scripture();
        addObject(scri,580,373);
        Scripture scri2 = new Scripture();
        addObject(scri2,837,243);
        Enemy boss = factory.createEnemy(1,800,900);
        Enemy enemy2 = factory.createEnemy(0,200,280);
        addObject(enemy2,210,315);
        updownCloud upnew =new updownCloud(50,284,2);
        addObject(upnew,48,284);
        addObject(boss,812,235);
        longBrick longbricknew = new longBrick();
        addObject(longbricknew,957,80);
        updownCloud upnew2 =new updownCloud(100,240,2);
        addObject(upnew2,844,240);
        
    }
    
    public void act() {
        String timeRemain = ((120000-countTime.millisElapsed())/1000+"");
        
        if(Integer.parseInt(timeRemain)>=0)
            showText(timeRemain, 50, 50);
        if(bullets.size()>0){
          for(int i=0; i<bullets.size();i++){
            Bullet bul=bullets.get(i);
            if(enemy.live==true){
                boolean whetherHit=bul.hit(enemy);
                if(whetherHit){
                    removeObject(enemy);
                    enemy.live=false;
                }
            }            
          }
        }
        
        
        
        if(enemybullets.size()>0){
            for(int i=0; i<enemybullets.size();i++){
                BulletEnemy bul=enemybullets.get(i);
//                bul.hitRole(monkey);
            }
        }
        
        
        
    }
}
