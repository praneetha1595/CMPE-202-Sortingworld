import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class Ipointer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Current extends Actor
{
    /**
     * Act - do whatever the Ipointer wants to do. This method is called whenever
     * th
     * e 'Act' or 'Run' button gets pressed in the environment.
     */
       public Current()
    { 
        GreenfootImage img1=new GreenfootImage(70,50);
        img1.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN, 20));
        img1.drawString("current",2,25);
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
