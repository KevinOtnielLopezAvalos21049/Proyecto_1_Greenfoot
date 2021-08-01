import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaEnemiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaEnemiga extends Actor
{
    /**
     * Act - do whatever the CopyOfBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeTouching(Jugador1.class); 
        removeTouching(Jugador2.class); 
       Eliminar1();
       Eliminar2();
       move(10);
    }
      
    public void Eliminar1() 
    {
        
       Actor enemy = getOneIntersectingObject(Jugador1.class);
       if(enemy != null)
       {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
    }
    
        public void Eliminar2() 
    {
        
       Actor enemy = getOneIntersectingObject(Jugador2.class);
       if(enemy != null)
       {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
    }
    
}
