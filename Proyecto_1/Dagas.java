import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dagas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dagas extends Jugador2
{
    /**
     * Act - do whatever the Dagas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       setLocation(getX() + speed, getY());
       //checkBoundaries();
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
       if(enemy != null) {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
    }
    
    private int speed = 10;
}
