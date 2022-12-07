import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
    private GifImage SlimeDown= new GifImage("Version_3/downAnimation.gif");
    private GifImage SlimeFront = new GifImage("Version_3/frontAnimation.gif");
    
    private int orientation = 1;
    
    private int[] upLeft = {28,120};
    private int[] downLeft = {28, 370};
    private int[] upRight = {674, 120};
    private int[] downRight = {674, 370};
    private int[] doorLeft = {297, 120};
    private int[] doorRight = {400, 120};
    
    
    public void act() {
        moveLeft();
        moveRight();
        moveUp();
        moveDown();
        staticMove();
    }
    
    // Movement
    public void moveLeft() {
        if(Greenfoot.isKeyDown("A") && canMoveLeft()) {
            move(-3);
            setImage("Version_3/Slime_left.gif");
            orientation = 3;
        }
    }
    public void moveRight() {
        if(Greenfoot.isKeyDown("D") && canMoveRight()) {
            move(3);
            setImage("Version_3/Slime_right.gif");
            orientation = 2;
        }
    }
    public void moveUp() {
        if(Greenfoot.isKeyDown("W") && canMoveUp()) {
            setLocation(getX(), getY()-3);
            setImage(SlimeFront.getCurrentImage());
            orientation = 0;
        }
    }
    public void moveDown() {
        if(Greenfoot.isKeyDown("S") && canMoveDown()) {
            setLocation(getX(), getY()+3);
            setImage(SlimeDown.getCurrentImage());
            orientation = 1;
        }
    }
    public void staticMove() {
        if(!Greenfoot.isKeyDown("S") && !Greenfoot.isKeyDown("W") && !Greenfoot.isKeyDown("A") && !Greenfoot.isKeyDown("D") && orientation == 0) {
            setImage(SlimeFront.getCurrentImage());
        } else if(!Greenfoot.isKeyDown("S") && !Greenfoot.isKeyDown("W") && !Greenfoot.isKeyDown("A") && !Greenfoot.isKeyDown("D") && orientation == 1) {
            setImage(SlimeDown.getCurrentImage());
        }
    }
    
    //Posibility of Movement Scenary
    public boolean canMoveUp() {
        if(getY()-3 > 120) {
            return true;
        } else {
            return false;
        }
    }
    public boolean canMoveDown() {
        if(getY()+3 < 350) {
            return true;
        } else {
            return false;
        }
    }
    public boolean canMoveRight() {
        if(getX()+3 < 652) {
            return true;
        } else {
            return false;
        }
    }
    public boolean canMoveLeft() {
        if(getX()-3 > 45) {
            return true;
        } else {
            return false;
        }
    }
}
