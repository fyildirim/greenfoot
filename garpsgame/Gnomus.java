import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gnomus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gnomus extends Actor
{
    public void act() 
    {
    	move(1);
    	if(Greenfoot.getRandomNumber(100) > 90) setRotation(getRotation() + 30);
    	if(atWorldEdge()) {
    		if(Greenfoot.getRandomNumber(10) > 5) {
    		    setRotation(getRotation() + 255);
    		}
    		else {
    		    setRotation(getRotation() - 255);
    		}
    	}
    	//setRotation(Greenfoot.getRandomNumber(361));
    }   
    public boolean atWorldEdge() {
        int x, y, wx, wy, i, j; 
        i = getImage().getWidth() / 2;
        j = getImage().getHeight() / 2;
        wx = getWorld().getWidth() - i;
        wy = getWorld().getHeight() - j;
        if(getX() <= i || getY() <= j || getX() >= wx || getY() >= wy) {
            return true;
        }
        return false;
    }
}


