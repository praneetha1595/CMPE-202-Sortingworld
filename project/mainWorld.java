import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{

    /**
     * Constructor for objects of class MainWorld.
     * 
     */
    public MainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        // GreenfootImage img1=new GreenfootImage(800,600);
         //getImage().setSize(800,600);
        prepare();
    }
    public void prepare()
    {   
        addObject(new Label("Welcome to Sorting world",40,500,370),425,125);
        addObject(new bubble(),200,250);
          addObject(new merge(),650,250);
            addObject(new quick(),200,375);
              addObject(new insertion(),650,375);
                addObject(new selection(),415,500);
    }
    
}
