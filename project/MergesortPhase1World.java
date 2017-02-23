import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MergesortPhase1World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergesortPhase1World extends World  
{

    /**
     * Constructor for objects of class MergesortPhase1World.
     * 
     */
    public MergesortPhase1World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void prepare()
    {   
        addObject(new Label("MERGE SORT-ALGORITHM",40,700,500),450,120);
        GreenfootImage drawedImage = new GreenfootImage("merge_sort_1.png");//the image that is drawed;
         getBackground().drawImage(drawedImage, 200, 150);
        
        addObject(new Home(),100,450);
       
        addObject(new Next(),100,350);
       
    }
    
}
