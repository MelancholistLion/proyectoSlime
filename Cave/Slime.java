import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("A")) {
            move(-3);
            setImage("Slime_left.png");
        }
        if(Greenfoot.isKeyDown("D")) {
            move(3);
            setImage("Slime_right.png");
         
        }
        if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY()+3);
            setImage("Slime_down.png");
        }
        if(Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY()-3);
            setImage("Slime_front.png");
        }
    }
}
