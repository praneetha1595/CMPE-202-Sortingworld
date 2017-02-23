import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bubble extends Button
{
    /**
     * Act - do whatever the bubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mousePressed(this))
     {
        Greenfoot.setWorld(new BubblesortWorld());
    }
    }    
}
