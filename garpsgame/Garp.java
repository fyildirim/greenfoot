import greenfoot.*;

public class Garp extends Actor {
    private GreenfootImage LinksGarp = new GreenfootImage("GarpLeft.png");
    private GreenfootImage RechtsGarp = new GreenfootImage("GarpRight.png");
    private GreenfootImage Explosion = new GreenfootImage("explosion.png");
    private GreenfootImage dood = new GreenfootImage(1, 1);
    
    public boolean alive = true;
    
    public Garp() {
        dood.clear();
    }
    
    public void act() {
        movingAndTurning();
        collectingDiamonds();
        rockCheck();
        bombCheck();
        gnomusCheck();
        if(alive == false) Greenfoot.stop();
    }
    
    protected void movingAndTurning() {
        if(alive) {
            
        	if (Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("right")) {setRotation(0);}
        	if (Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("left")) {setRotation(180);}
        	if (Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("up")) {setRotation(270);}
        	if (Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("down")) {setRotation(90);}
        	if (Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("D") ||
        	Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right")) {setRotation(315);}
        	if (Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("A") || 
        	Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left")) {setRotation(225);}
        	if (Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("D") ||
        	Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right")) {setRotation(45);}
        	if (Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("A") ||
        	Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left")) {setRotation(135);}
        	if(Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("S") || 
        	Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("W") ||
        	Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right") ||
        	Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down")) {
        	    if(Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("left")) setImage(LinksGarp);
        	    else setImage(RechtsGarp);
        	    move(5);
        	 
        	}
        }
    }
    
    protected void collectingDiamonds() {
        Actor diamond = getOneObjectAtOffset(0, 0, Diamond.class);
        if(foundDiamond()) {
            getWorld().removeObject(diamond);
        }
    }
    
    protected void rockCheck() {
        if(foundRock()) {
            move(-5);    
        }
    }
    
    protected void bombCheck() {
        if(foundBomb()) {
            Actor bomb = getOneObjectAtOffset(0, 0, Bomb.class);
			getWorld().addObject(new Explosion(), getX(), getY());
            this.setImage(dood);
            alive = false;
            Greenfoot.stop();
        }
    }
    
    protected void gnomusCheck() {
        Gnomus gnomus = getOneObjectAtOffset(0, 0, Gnomus.class);
        if (gnomus != null) {
            this.setImage(dood);
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
        if(bomb != null) {
            this.setImage(dood);
            return true;
        }
        else {return false;}
    }
}