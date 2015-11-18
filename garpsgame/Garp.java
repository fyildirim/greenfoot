import greenfoot.*;

public class Garp extends Actor {
	private GreenfootImage LinksGarp = new GreenfootImage("GarpLeft.png");
	private GreenfootImage RechtsGarp = new GreenfootImage("GarpRight.png");
	private GreenfootImage Explosion = new GreenfootImage("explosion.png");
	
	public boolean alive = true;
	
	public Garp() {

	}

	public void act() {
	    if(foundRock()) {
	    	move(-5);    
	    }
	    
	    if(foundBomb()) {
	        Actor bomb = getOneObjectAtOffset(0, 0, Bomb.class);
	        bomb.setImage(Explosion);
	        alive = false;
	        Greenfoot.stop();
	    }
	    
	    Actor diamond = getOneObjectAtOffset(0, 0, Diamond.class);
	    if(foundDiamond()) {
	        getWorld().removeObject(diamond);
	    }
	    
		if (Greenfoot.isKeyDown("right")) {
			setImage(RechtsGarp);
			setRotation(0);
			move(5);
		}
		
		if (Greenfoot.isKeyDown("left")) {
			setImage(LinksGarp);
			setRotation(180);
			move(5);
		}
		
		if (Greenfoot.isKeyDown("up")) {
			setImage(RechtsGarp);
			setRotation(270);
			move(5);
		}
		
		if (Greenfoot.isKeyDown("down")) {
			setImage(RechtsGarp);
			setRotation(90);
			move(5);
		}

		Gnomus gnomus = getOneObjectAtOffset(0, 0, Gnomus.class);
		if (gnomus != null) {
			getWorld().removeObject(this);
			Greenfoot.stop();
			alive = false;
		}
	}
	protected boolean foundRock() {
        Actor rock = getOneObjectAtOffset(0, 0, Rock.class);
        if(rock != null) {return true;}
        else {return false;}
    }
    
    protected boolean foundDiamond() {
        Actor diamond = getOneObjectAtOffset(0, 0, Diamond.class);
        if(diamond != null) {return true;}
        else {return false;}
    }
    
    protected boolean foundBomb() {
        Actor bomb = getOneObjectAtOffset(0, 0, Bomb.class);
        if(bomb != null) {return true;}
        else {return false;}
    }
}