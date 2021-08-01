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
       setLocation(getX() + speed, getY());
       //setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
       //Barreras();
       destroyEnemies();
       
    }
    
    public void checkBoundaries()
    {
        if(getX() > getWorld().getWidth() - 1) 
            getWorld().removeObject(this);
       else if(getX() < 1) 
            getWorld().removeObject(this);
       if(getY() > getWorld().getHeight() - 1) 
            getWorld().removeObject(this);
       else if(getY() < 1) 
            getWorld().removeObject(this);
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
    
    int speed = 10;
}