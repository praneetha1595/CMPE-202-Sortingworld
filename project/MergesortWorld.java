import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quicksortWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergesortWorld extends World implements WorldResetStrategy
{

    /**
     * Constructor for objects of class quicksortWorld.
     * 
     */
    public MergesortWorld()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void prepare()
    {   
        
        addObject(new Label("MERGESORT-ALGORITHM \n \t\t\t MERGE PHASE",40,700,500),450,120);
        addObject(new Emptyarray(),350,250);
        addObject(new Emptyarray(),650,250);
        addObject(new Emptyarray2(),500,450);
        addObject(new MergeSortStepbutton(),80,250);
        addObject(new Resetbutton(),80,350);
         addObject(new Home(),100,450);
        addObject(new Ipointer(),270,215);
        addObject(new Jpointer(),570,215);
        addObject(new Obj(2),270,250);
        addObject(new Obj(7),320,250);
        addObject(new Obj(26),370,250);
        addObject(new Obj(49),420,250);
        addObject(new Obj(3),570,250);
        addObject(new Obj(5),620,250);
        addObject(new Obj(17),670,250);
        addObject(new Obj(22),730,250);
    }
     public void reset()
     {
        Greenfoot.setWorld(new MergesortWorld());
    }
}
