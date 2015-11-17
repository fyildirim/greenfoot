import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garp extends Actor
{
    /**
     * Act - do whatever the Garp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage LinksGarp = new GreenfootImage("GarpLeft.png");
    private GreenfootImage RechtsGarp = new GreenfootImage("GarpRight.png");
    
    public Garp() {
    	    
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")) {
            setImage(RechtsGarp);
            setRotation(0);
            move(5);
        }
        if(Greenfoot.isKeyDown("left")) {
			setImage(LinksGarp);
			setRotation(0);
            move(-5);
        }
        if(Greenfoot.isKeyDown("up")) {
            setImage(RechtsGarp);
            setRotation(270);
            move(5);
        }
        if(Greenfoot.isKeyDown("down")) {
            setImage(RechtsGarp);
            setRotation(90);
            move(5);
        }
        
        Gnomus gnomus = getOneObjectAtOffset(0, 0, Gnomus.class);
        if (gnomus != null) {
        	getWorld().removeObject(this);
        	Greenfoot.stop();
        }
    }    
}
