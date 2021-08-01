import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfEnemigoPrincipal2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfEnemigoPrincipal2 extends Actor
{
    int speed = 10; 
    /**
     * Act - do whatever the CopyOfEnemigoPrincipal2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public void act() { 
        // Eliminar a los jugadores
        MovimientoEnemigo();
        Rotar();
        checkFire();
        turnAround();
        removeTouching(CopyOfJugador1.class); 
        removeTouching(CopyOfJugador2.class); 
        
        //Parametros de movilidad.
        java.util.List<CopyOfJugador2> playersInWorld = getWorld().getObjects(CopyOfJugador2.class);
        if (!playersInWorld.isEmpty()) {
            CopyOfJugador2 player = playersInWorld.get(0);
            moveToPlayer(player);
        }
    }
     
    // Mpvilidad hacia el jugadro 1
    public void moveToPlayer(CopyOfJugador2 player) {
        int deltaX = getX() - player.getX();
        int deltaY = getY() - player.getY();
        if (Math.abs(deltaX) > Math.abs(deltaY)) {
            if (deltaX > 0) {
                setLocation(getX() - 1, getY());
            }
            else if (deltaX < 0) {
                setLocation(getX() + 1, getY());
            }
        }
        else {
            if (deltaY > 0) {
                setLocation(getX(), getY() - 1);
            }
            else if (deltaY < 0) {
                setLocation(getX(), getY() + 1);
            }
        }
    }
    
             public void turnAround()
    {
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
    }
    
        public void MovimientoEnemigo()
    {
        
            if(Greenfoot.isKeyDown("up"))
            { 
                setLocation(getX() - speed ,getY());
            }    
            if(Greenfoot.isKeyDown("down")) 
            {
                setLocation(getX() +  speed ,getY());
            }
    
    }
      
        public void checkFire()
    {
       if(Greenfoot.isKeyDown("control")) 
       {
           CopyOfBalaEnemiga bala = new CopyOfBalaEnemiga(); 
           getWorld().addObject(bala, getX(), getY());
           bala.setRotation(getRotation()); 
       }
    } 
    public void Rotar()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            turn(20);
        }
    }
}
