import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaDeInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaDeInicio extends World
{

    /**
     * Constructor for objects of class PantallaDeInicio.
     * 
     */
    public PantallaDeInicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new MyWorld());
    }
}