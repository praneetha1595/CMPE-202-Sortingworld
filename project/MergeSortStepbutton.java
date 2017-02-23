import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MergeSortStepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergeSortStepbutton extends Button
{
    int[] values={2,7,26,49,3,5,17,22};
    int i=0; boolean done=false;
    int j=values.length/2;
    List<Obj> array;
    List<Obj> array1;
    List<Obj> array2;
    int xval=320;
    public void act() 
    {  
        array=getWorld().getObjects(Obj.class);
         
        if(Greenfoot.mousePressed(this)&&!done)
        {
         done= mergesort();   
        } 
        if(Greenfoot.mousePressed(this)&&done)
        {
           String s=" Sorting is done ";
           getWorld().addObject(new Label(s),450,550);
        }
    }
    public boolean mergesort()
    {
        if(i<4&&j<8)
        {
            if(values[i]<values[j])
           { changePosition(array.get(i));
               Ipointer ipoint=(Ipointer)getWorld().getObjects(Ipointer.class).get(0);
               ipoint.move(50); i++;
                return false;         } //move values[i]
            else
           { changePosition(array.get(j));
               Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
               jpoint.move(50); j++;
                return false; }  //move values[]\
         }
            else if(i<4)
            {  changePosition(array.get(i));
                Ipointer ipoint=(Ipointer)getWorld().getObjects(Ipointer.class).get(0);
               ipoint.move(50); i++;
                return false; }//move vales1
            if(j<8)
            {   changePosition(array.get(j));
                Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
               jpoint.move(50);j++;
                return false;}//vlues 2;
            else{
                done=true;
                return true;
            }
         
        }
        
       public void changePosition(Obj ob)
       {   
           ob.setLocation(xval,450);
           xval=xval+50;
        }   
    }

