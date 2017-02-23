import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class Pivot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pivot extends Actor
{
    /**
     * Act - do whatever the Pivot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
 
       */
        public Pivot()
    { 
        GreenfootImage img1=new GreenfootImage(50,50);
        img1.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN, 15));
        img1.drawString("Pivot",15,25);
        setImage(img1);
        
    }
    public void act() 
    {
        // Add your action code here.
    } 
      public void changePosition(int position)
    { move(position);
    }
}
