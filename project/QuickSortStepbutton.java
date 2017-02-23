import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class QuickSortStepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortStepbutton extends Button
{ 
     int[] values={46,92,65,24,10,77,33,9};
    int low=0; boolean done=false;
    int high=values.length-1;
     int pivot=values[0];
   List<Obj> array;
   
    public void act() 
    {   array=getWorld().getObjects(Obj.class);
        if(Greenfoot.mouseClicked(this)&&!done)
       {  List<Label> l= getWorld().getObjects(Label.class);
           getWorld().removeObjects(l);
            getWorld().addObject(new Label("QUICK SORT-ALGORITHM",40,700,500),450,120);
           done=quicksort();
        }
        if(Greenfoot.mouseClicked(this)&&done)
       {    String s=" Pivot"+pivot+" element is placed ";
           getWorld().addObject(new Label(s,20,400,300),450,350);
            Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
             Pivot pivot=(Pivot)getWorld().getObjects(Pivot.class).get(0);
             pivot.setLocation(jpoint.getX(),100);
           getWorld().addObject(new Label("now divide the left and right part of pivot element \n and perform quicksort again",20,600,600),450,550);
           
        }
    } 
      public boolean quicksort()
    {   
        
        if(high>low)
        {
            if(low<=high&&values[low]<=pivot)
           {   low++;
                Ipointer ipoint=(Ipointer)getWorld().getObjects(Ipointer.class).get(0);
                ipoint.changePosition(55); 
              return false;
            }
         if(low<=high&&values[high]>pivot)
            {
             high--;
            Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
            jpoint.changePosition(-55);
             return false;
            }
            if(high>low)
            { exchangeNumbers(low,high);
               
                 swap(low,high);
                return false;
            }
        }  
           if(high>0&&values[high]>=pivot)
           {
               high--;
           Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
            jpoint.changePosition(-55);
           return false;
            }
            if(pivot>values[high])
            {
                 //pivot in place;
                 exchangeNumbers(0,high);
                 swap(0,high);
               
                return true;
            }
       return false;
        }
    
       private void exchangeNumbers(int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        }
    
    
    public void swap(int i,int j)
    { String s= array.get(i).getNumber() +" is swapped with "+ array.get(j).getNumber();
        getWorld().addObject(new Label(s),450,300);
        Obj ob1=array.get(i);
        Obj ob2=array.get(j);
        
      int move1=ob2.getX()-ob1.getX();
              
         ob1.move(move1);
        ob2.move(-move1);
         
         Obj temp=ob1;
         ob1=ob2;
         ob2=temp;
         
    }
}
  