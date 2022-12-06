import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    private GifImage myImage = new GifImage("Cold_Frog_JE1_BE1.gif");
    public Frog() {
        int newHeight = (int)myImage.getHeight;
        int newWidth = (int)myImage.getWidth()/8;
        myImage.scale(newWidth, newHeight);
    }
    public void act()
    {
        setImage(myImage.getCurrentImage());
        /*if(Greenfoot.isKeyDown("A")) {
            move(-3);
        }
        if(Greenfoot.isKeyDown("D")) {
            move(3);
        }
        if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY()-3);
        }*/
    }
}
