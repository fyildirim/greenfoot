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
        populateTheWorld();
    }
    
    protected void populateTheWorld() {
        for(int j = 0; j < 6; j++) {
            addObject(new Bomb(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
        }
        addObject(new Garp(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
        addObject(new Gnomus(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
        addObject(new GameOverWindow(), 349, 249);
        for(int i = 0; i < 10; i++) {
            addObject(new Rock(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
            addObject(new Diamond(), Greenfoot.getRandomNumber(751),Greenfoot.getRandomNumber(501));
        }
        setPaintOrder(GameOverWindow.class,	Explosion.class, Bomb.class, Garp.class, Gnomus.class, Diamond.class, Rock.class);
    }
}
