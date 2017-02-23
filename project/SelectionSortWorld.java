import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSortWorld extends World  implements WorldResetStrategy
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SelectionSortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    public void prepare()
    {  addObject(new Label("SELECTION SORT-ALGORITHM",40,700,500),450,120);
        addObject(new Emptyarray(),350,156);
        addObject(new SelectionSortStepButton(),80,150);
        addObject(new Resetbutton(),80,250);
         addObject(new Home(),100,350);
        addObject(new Ipointer(),270,115);
        addObject(new Jpointer(),270,115);
        addObject(new Obj(46),270,156);
        addObject(new Obj(92),320,156);
        addObject(new Obj(65),370,156);
        addObject(new Obj(24),420,156);
        
    }
     public void reset()
     {
        Greenfoot.setWorld(new SelectionSortWorld());
    }
}
