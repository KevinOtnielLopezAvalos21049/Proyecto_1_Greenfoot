import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends EnemigoPrincipal
{

    /**
     * Act - do whatever the CopyOfEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        moveAround();

    }
    public void moveAround()
    {
        turn(10);
        
    } 
}
