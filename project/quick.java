import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class quick extends Button
{
    /**
     * Act - do whatever the quick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mousePressed(this))
     {
        Greenfoot.setWorld(new QuicksortWorld());
    }
    }    
}
