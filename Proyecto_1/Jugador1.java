import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador1 extends Actor
{
    
    /**
     * Act - do whatever the Jugador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // Determinar las reglas de movilidad
    
    public void act ()
    {
        movimeinto();
        contador();
        checkFire();
    }
    
    public void movimeinto()
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("w")) 
        {
            y--;
        }    
        if(Greenfoot.isKeyDown("s")) 
        {
            y++;
        }
        if(Greenfoot.isKeyDown("a"))
        { 
            x--;
        }    
        if(Greenfoot.isKeyDown("d")) 
        {
            x++;
        }

        setLocation(x,y);

    }
    
        public void contador()
        {
        Actor enemigo = getOneIntersectingObject(Enemigo.class);
        MyWorld myWorld = (MyWorld)getWorld();
        if(enemigo != null)
        {
                myWorld.removeObject(enemigo);
                myWorld.increaseScore();
        }
    }
    
        public void mouse()
    {
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
    }
    
        
        public void checkFire()
    {
       if(Greenfoot.isKeyDown("space")) 
       {
           getWorld().addObject(new Bullet(), getX(), getY());
       }
    } 
    

    
    
 

    
}
