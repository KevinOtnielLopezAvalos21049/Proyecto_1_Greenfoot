import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the CopyOfBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       destroyEnemies();
       move(10);
    }
      
    public void destroyEnemies() 
    {
        
       Actor enemy = getOneIntersectingObject(EnemigoPrincipal.class);
       if(enemy != null)
       {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
    }
    
}