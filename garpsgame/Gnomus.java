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
    	move(10);
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
    public boolean atWorldEdge()
	{
		int x; //declaratie
		int y;
		x = getX(); //Vraag op waar Gnomus is ten opzichte van de linkerrand
		y = getY();
		if(x == 0 || x == 750 || x == 749 || y == 0 || y == 500 || y == 499) { // Is x gelijk aan 0?
			return true; //Geef true terug
		}
		return false; //Dief staat niet aan een rand van de wereld dus false teruggeven
	}
}


