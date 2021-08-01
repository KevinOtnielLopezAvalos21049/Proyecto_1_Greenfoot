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
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new MyWorld());

        if (Greenfoot.isKeyDown("1"))
            Greenfoot.setWorld(new Nivel1());

        if (Greenfoot.isKeyDown("2"))
            Greenfoot.setWorld(new Nivel1Multi());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}