import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala2 extends Actor
{
    /**
     * Act - do whatever the Bala2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move(10);
       removeTouching(CopyOfEnemigoPrincipal2.class);
       removeTouching(CopyOfEnemigoPrincipal.class);
    }
}
