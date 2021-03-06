import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador1 extends Actor
{
    int speed = 3;
    /**
     * Act - do whatever the Jugador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // Determinar las reglas de movilidad
    
    public void act ()
    {
        turnAround();
        Movimiento1();
        contador();
        //contador1();
        checkFire();
    }

    public void Movimiento1()
    {

        if(Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX(),getY() - speed);
        }    
        if(Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(),getY() + speed);
        }
        if(Greenfoot.isKeyDown("a"))
        { 
            setLocation(getX() - speed ,getY());
        }    
        if(Greenfoot.isKeyDown("d")) 
        {
            setLocation(getX() +  speed ,getY());
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
    
    /*
            public void contador1()
        {
        Actor enemigo = getOneIntersectingObject(Enemigo.class);
        Nivel1A nivel1A = (Nivel1A)getWorld();
        if(enemigo != null)
        {
                nivel1A.removeObject(enemigo);
                nivel1A.increaseScore1();
        }
    }
    
    */
   
    
        public void turnAround()
    {
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
    }
    
        
        public void checkFire()
    {
       if(Greenfoot.isKeyDown("space")) 
       {
           Bala bala = new Bala(); 
           getWorld().addObject(bala, getX(), getY());
           bala.setRotation(getRotation()); 
       }
    } 
    

    
    
 

    
}
