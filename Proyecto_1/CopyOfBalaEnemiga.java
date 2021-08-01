import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfBalaEnemiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfBalaEnemiga extends Actor
{
    /**
     * Act - do whatever the CopyOfBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeTouching(CopyOfJugador1.class); 
        removeTouching(CopyOfJugador2.class); 
        removeTouching(CopyOfCopyOfJugador1.class); 
       Eliminar1();
       Eliminar2();
       move(10);
    }
      
    public void Eliminar1() 
    {
        
       Actor enemy = getOneIntersectingObject(CopyOfJugador1.class);
       if(enemy != null)
       {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
    }
    
        public void Eliminar2() 
    {
        
       Actor enemy = getOneIntersectingObject(CopyOfJugador2.class);
       if(enemy != null)
       {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
    }
    
}
