import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class insertion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class insertion extends Button
{
    /**
     * Act - do whatever the insertion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     //   // Add your action code here.
     if(Greenfoot.mousePressed(this))
     {
        Greenfoot.setWorld(new InsertionsortWorld());
    }
    }    
}
