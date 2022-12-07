import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Frog extends Actor
{
    private GreenfootImage myImage = new GreenfootImage("frog.png");
    
    public Frog() {
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            DialogueFrame ff = new DialogueFrame();
            FrogDialogue fd = new FrogDialogue();
            
            getWorld().addObject(ff, 320, 320);
            getWorld().addObject(fd, 325, 325);
            
            int frame = 0;
            ff.setLimit(6);
        }
    }
}
