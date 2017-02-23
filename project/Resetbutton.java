import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Resetbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resetbutton extends Button
{// BubblesortWorld b=new BubblesortWorld();
    public WorldResetStrategy strategy;
    /**
     * Act - do whatever the Resetbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     Greenfoot.setWorld(new BubblesortWorld()); */
    public void act() 
    {
     //   // Add your action code here.
     if(Greenfoot.mousePressed(this))
     {
        doReset();
    }
    } 
       public void doReset()
       {
           try{
               changeStrategy(this.getWorld());
               strategy.reset();
            }
            catch(Exception e)
            { System.out.println(e.toString());
            }
        }
    
    public void changeStrategy(World w)
    {
       if(w instanceof MergesortWorld)
         strategy= new MergesortWorld();
         if(w instanceof BubblesortWorld)
         strategy= new BubblesortWorld();
         if(w instanceof SelectionSortWorld)
         strategy= new SelectionSortWorld();
         if(w instanceof QuicksortWorld)
         strategy= new QuicksortWorld();
         if(w instanceof InsertionsortWorld)
         strategy= new InsertionsortWorld();
        
    }
}
