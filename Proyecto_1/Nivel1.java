import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{
    public int score = 0;
    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
    }
        public void act()
    {
        showText("Nivel: "+ score,100, 50);
    }    
        private void prepare()
    {
        Enemigo enemigo = new Enemigo();
        addObject(enemigo,1174,14);
        CopyOfEnemigoPrincipal copyOfEnemigoPrincipal = new CopyOfEnemigoPrincipal();
        addObject(copyOfEnemigoPrincipal,1028,20);
        CopyOfEnemigoPrincipal copyOfEnemigoPrincipal2 = new CopyOfEnemigoPrincipal();
        addObject(copyOfEnemigoPrincipal2,1112,146);
        CopyOfEnemigoPrincipal copyOfEnemigoPrincipal3 = new CopyOfEnemigoPrincipal();
        addObject(copyOfEnemigoPrincipal3,1055,330);
        copyOfEnemigoPrincipal3.setLocation(947,151);
        copyOfEnemigoPrincipal2.setLocation(1158,274);
        copyOfEnemigoPrincipal2.setLocation(1122,316);
        enemigo.setLocation(1139,134);
        copyOfEnemigoPrincipal3.setLocation(1067,202);
        CopyOfJugador1 copyOfJugador1 = new CopyOfJugador1();
        addObject(copyOfJugador1,49,523);
        enemigo.setLocation(1172,46);
    }
    
        public void increaseScore1()
    {
        score = score + 1;
    }
}
