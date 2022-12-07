import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DialogueFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DialogueFrame extends Actor
{
    private int limit;
    private int time = 0;
    public void act()
    {
        if(Greenfoot.isKeyDown("ENTER") && time < limit) {
            time++;
            Greenfoot.delay(4);
        } else if(time >= limit) {
            getWorld().removeObject(this);
        }
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
}
