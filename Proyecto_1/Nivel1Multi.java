import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1Multi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1Multi extends World
{
    public int score = 0;
    /**
     * Constructor for objects of class Nivel1Multi.
     * 
     */
    public Nivel1Multi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
        sonido();
    }
            public void act()
    {
        showText("Nivel: "+ score,100, 50);
    }  
    private void prepare()
    {
            CopyOfCopyOfJugador1 copyOfCopyOfJugador1 = new CopyOfCopyOfJugador1();
        addObject(copyOfCopyOfJugador1,80,500);
        CopyOfCopyOfEnemigoPrincipal copyOfCopyOfEnemigoPrincipal = new CopyOfCopyOfEnemigoPrincipal();
        addObject(copyOfCopyOfEnemigoPrincipal,1060,67);
        copyOfCopyOfEnemigoPrincipal.setLocation(978,154);
        CopyOfCopyOfEnemigoPrincipal copyOfCopyOfEnemigoPrincipal2 = new CopyOfCopyOfEnemigoPrincipal();
        addObject(copyOfCopyOfEnemigoPrincipal2,990,264);
        CopyOfEnemigoPrincipal2 copyOfEnemigoPrincipal2 = new CopyOfEnemigoPrincipal2();
        addObject(copyOfEnemigoPrincipal2,1141,329);
        CopyOfEnemigoPrincipal2 copyOfEnemigoPrincipal22 = new CopyOfEnemigoPrincipal2();
        addObject(copyOfEnemigoPrincipal22,1132,172);
        Enemigo enemigo = new Enemigo();
        addObject(enemigo,1154,54);
        CopyOfJugador2 copyOfJugador2 = new CopyOfJugador2();
        addObject(copyOfJugador2,280,531);
    }

        public void increaseScore2()
    {
        score = score + 1;
    }
    
        public void sonido()
    {
        Greenfoot.playSound("Inicio.wav");
    }
}
