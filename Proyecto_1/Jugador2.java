import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador2 extends Actor
{
    /**
     * Act - do whatever the Jugador2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimiento();
        mouse(); 
        checkFire();
        contador();
    }
    
    public void movimiento()
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("up"))
        {
            y--;
            
        }
        if(Greenfoot.isKeyDown("down"))
        {
            y++;
        }
        if(Greenfoot.isKeyDown("left"))
        {
            x--;
        }
        if(Greenfoot.isKeyDown("right"))
        {
         x++;
        }
        setLocation(x,y);
        

    }
    
    public void mouse()
    {
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
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

    
                public void checkFire()
        {
           if(Greenfoot.isKeyDown("l")) 
           {
               getWorld().addObject(new Dagas(), getX(), getY());
           }
    }
}
