import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
  
    
    public Label(String s,int x)
    { 
        GreenfootImage img1=new GreenfootImage(250,30);
        img1.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN, x));
        img1.drawString(s,2,20);
        setImage(img1);
        
    }
     public Label(String s)
    { 
        GreenfootImage img1=new GreenfootImage(300,30);
        img1.setFont(new java.awt.Font("Comic Sans MS", Font.PLAIN, 25));
        img1.drawString(s,2,20);
        setImage(img1);
        
    }
    public Label(String s,int x,int x1,int y1)
    { 
        GreenfootImage img1=new GreenfootImage(x1,y1);
        img1.setFont(new java.awt.Font("Comic Sans MS",Font.PLAIN, x));
        img1.drawString(s,2,200);
        setImage(img1);
        
    }
     public Label(int x1,int y1)
    { 
        GreenfootImage img1=new GreenfootImage(x1,y1);
       img1.setColor(Color.RED);
        img1.fill();
        setImage(img1);
        
    }
}
