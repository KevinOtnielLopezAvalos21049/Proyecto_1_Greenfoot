import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1200, 600, 1); 
        prepare();
        bienvenida();
        instrucciones();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        EnemigoPrincipal enemigoPrincipal = new EnemigoPrincipal();
        addObject(enemigoPrincipal,1140,36);
        enemigoPrincipal.setLocation(994,240);
        Enemigo enemigo = new Enemigo();
        addObject(enemigo,1180,114);
        enemigoPrincipal.setLocation(1100,95);
        Jugador1 jugador1 = new Jugador1();
        addObject(jugador1,200,133);
        Jugador2 jugador2 = new Jugador2();
        addObject(jugador2,428,389);
        jugador1.setLocation(191,162);
        enemigoPrincipal.setLocation(1088,175);
        enemigo.setLocation(1191,79);
        enemigoPrincipal.setLocation(1191,32);
        enemigoPrincipal.setLocation(1124,139);
        enemigoPrincipal.setLocation(1040,369);
        enemigoPrincipal.setLocation(1053,381);
        enemigo.setLocation(1152,44);
        enemigoPrincipal.setLocation(1044,283);
        jugador1.setLocation(381,536);
        jugador2.setLocation(663,525);
        jugador1.setLocation(356,505);
        enemigoPrincipal.setLocation(981,23);
        enemigoPrincipal.setLocation(916,109);
    }

    public void bienvenida()
    {
        showText("Bienvenid@ al primer nivel de Striker!",600,50);
    }
    
    public void instrucciones()
    {
        showText("J1 - Movimiento: WASD; Ataque: Espacio", 250, 590);
        showText("J2 - Movimento: UP,LEFT,DOWN,RIGHT; Ataque: Clic Izquierdo",850,590);
    }
    
    public void act()
    {
        showText("Nivel: "+ score,100, 50);
    }
    public void increaseScore()
    {
        score = score + 1;
    }
    

    
}
