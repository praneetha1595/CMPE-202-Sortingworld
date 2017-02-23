import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class selection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selection extends Button
{
    /**
     * Act - do whatever the selection wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.mousePressed(this))
     {
        Greenfoot.setWorld(new SelectionSortWorld());
    }
    }    
}
