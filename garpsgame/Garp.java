import greenfoot.*;

public class Garp extends Actor {
	private GreenfootImage LinksGarp = new GreenfootImage("GarpLeft.png");
	private GreenfootImage RechtsGarp = new GreenfootImage("GarpRight.png");

	public Garp() {

	}

	public void act() {
		if (Greenfoot.isKeyDown("right")) {
			setImage(RechtsGarp);
			setRotation(0);
			move(5);
		}
		if (Greenfoot.isKeyDown("left")) {
			setImage(LinksGarp);
			setRotation(0);
			move(-5);
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
		}
	}
}