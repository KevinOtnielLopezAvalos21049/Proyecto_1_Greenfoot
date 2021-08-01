import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador2 extends Actor
{
    int speed = 3;
    
    /**
     * Act - do whatever the Jugador2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimiento();
        checkFire();
        contador();
    }
    
    public void movimiento()
    {
        if(Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(),getY() - speed);
        }    
        if(Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(),getY() + speed);
        }
        if(Greenfoot.isKeyDown("left"))
        { 
            setLocation(getX() - speed ,getY());
        }    
        if(Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX() +  speed ,getY());
        }
        if (Greenfoot.isKeyDown("control"))
        {
            turn(3);
        }
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
                Bala bala = new Bala(); 
               getWorld().addObject(bala, getX(), getY());
               bala.setRotation(getRotation()); 
           }
    }
}
