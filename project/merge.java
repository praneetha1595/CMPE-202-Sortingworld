import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class merge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class merge extends Button
{
    /**
     * Act - do whatever the merge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mousePressed(this))
     {
        Greenfoot.setWorld(new MergesortPhase1World());
    }
        
    }    
}
