import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class GameOverWindow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWindow extends Score
{
    
    GreenfootImage image = new GreenfootImage(1, 1);
    GreenfootImage diamondCount = new GreenfootImage(1, 1);

    
    public GameOverWindow() {
        setImage(image);
    }
    
    /**
     * Act - do whatever the GameOverWindow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getWorld().getObjects(Garp.class).get(0).alive == false) {
            
        	String text = "GAME OVER";
        	image.setFont(new Font("Arial", Font.BOLD, 100));
        	Dimension dim = getTextDimensions(image, text);
        	image.scale(dim.width, dim.height);
        	image.drawString(text, 0, dim.height);
        	setImage(image);
        
        }
        
    }    
}
