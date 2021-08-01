import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfJugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfJugador1 extends Actor
{
    int speed = 3;
    /**
     * Act - do whatever the CopyOfJugador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // Determinar las reglas de movilidad
    
    public void act ()
    {
        turnAround();
        Movimiento1();
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
    
        public void turnAround()
    {
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
    }
          
        public void checkFire()
    {
       if(Greenfoot.isKeyDown("space")) 
       {
           Bala2 bala = new Bala2(); 
           getWorld().addObject(bala, getX(), getY());
           bala.setRotation(getRotation()); 
       }
    } 
    

    
    
 

    
}
