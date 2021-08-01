import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1Multi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1Multi extends World
{

    /**
     * Constructor for objects of class Nivel1Multi.
     * 
     */
    public Nivel1Multi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
    }
            public void act()
    {
        showText("Nivel: 1", 100, 50);
    }  
            private void prepare()
    {
                CopyOfEnemigoPrincipal copyOfEnemigoPrincipal = new CopyOfEnemigoPrincipal();
        addObject(copyOfEnemigoPrincipal,993,41);
        CopyOfEnemigoPrincipal copyOfEnemigoPrincipal2 = new CopyOfEnemigoPrincipal();
        addObject(copyOfEnemigoPrincipal2,984,201);
        copyOfEnemigoPrincipal2.setLocation(1136,486);
        copyOfEnemigoPrincipal2.setLocation(1136,486);
        copyOfEnemigoPrincipal2.setLocation(1102,308);
        copyOfEnemigoPrincipal.setLocation(922,118);
        copyOfEnemigoPrincipal2.setLocation(1072,365);
        CopyOfEnemigoPrincipal2 copyOfEnemigoPrincipal22 = new CopyOfEnemigoPrincipal2();
        addObject(copyOfEnemigoPrincipal22,924,199);
        CopyOfEnemigoPrincipal2 copyOfEnemigoPrincipal23 = new CopyOfEnemigoPrincipal2();
        addObject(copyOfEnemigoPrincipal23,971,304);
        Enemigo enemigo = new Enemigo();
        addObject(enemigo,1138,52);
        CopyOfEnemigoPrincipal2 copyOfEnemigoPrincipal24 = new CopyOfEnemigoPrincipal2();
        addObject(copyOfEnemigoPrincipal24,1128,152);
        copyOfEnemigoPrincipal2.setLocation(1164,425);
        CopyOfJugador1 copyOfJugador1 = new CopyOfJugador1();
        addObject(copyOfJugador1,54,531);
        CopyOfJugador2 copyOfJugador2 = new CopyOfJugador2();
        addObject(copyOfJugador2,43,455);
    }
}
