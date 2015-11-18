import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GarpsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GarpsWorld extends World
{

    /**
     * Constructor for objects of class GarpsWorld.
     * 
     */
    public GarpsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        setPaintOrder(GameOverWindow.class, Explosion.class, Garp.class, 
        	Gnomus.class, Diamond.class, Bomb.class, Rock.class, Gnomus.class);
        addObject(new Garp(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
        addObject(new Gnomus(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
        addObject(new GameOverWindow(), 349, 249);
        for(int i = 0; i < 10; i++) {
            addObject(new Rock(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
            addObject(new Diamond(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
            addObject(new Bomb(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
        }
    }
}
