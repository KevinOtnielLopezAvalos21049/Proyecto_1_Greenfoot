import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemigoPrincipal extends Actor
{
        /**
         * Act - do whatever the Enemigo wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        
        
    public void act() { 
        // Eliminar a los jugadores
        
        removeTouching(Jugador1.class); 
        removeTouching(Jugador2.class); 
        
        //Parametros de movilidad.
        java.util.List<Jugador1> playersInWorld = getWorld().getObjects(Jugador1.class);
        if (!playersInWorld.isEmpty()) {
            Jugador1 player = playersInWorld.get(0);
            moveToPlayer(player);
        }
    }
     
    // Mpvilidad hacia el jugadro 1
    public void moveToPlayer(Jugador1 player) {
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
    
    public void Rotar()
    {
        
    }

}


