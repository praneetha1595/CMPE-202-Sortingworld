import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
/**
 * Write a description of class Stepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSortStepbutton extends Button
{ 
    /**
     * Act - do whatever the Stepbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 int y3=156;
     int[] values={46,92,65,24};
   int i=0;
   int j=1;
   
    public void act()
    
    {  
       int clicked=0;
      
        if(Greenfoot.mouseClicked(this))
        { 
        sort(getValues(),getI(),getJ());
           
         }
}
 public void sort(int[] values,int p,int q)
   {     int temp,i,j,y2;
      
          for(i=p; i < values.length-1; i++){
             
            for(j=q; j < values.length-i; j++){
                if(values[j-1] > values[j]){
                    temp=values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                    String swap=values[j]+" and "+values[j-1]+" are swapped";
                    getWorld().addObject(new Label(swap,20),650,y3+65);
                }
                String s=values[0]+"    "+values[1]+"    "+values[2]+"    "+values[3];
                y2=y3+65;
                getWorld().addObject(new Emptyarray(),348,y2);
                y3=y2;
                getWorld().addObject(new Label(s,25),370,y2);
                setI(i);
                setJ(j);
                setValues(values);
                getWorld().addObject(new Label("values: Pass="+i+" J="+j,20),650,y2-25);
                return;
            }
    
      String s=values[0]+"    "+values[1]+"    "+values[2]+"    "+values[3];
      y2=y3+65;
      getWorld().addObject(new Emptyarray(),348,y2);
      y3=y2;
      getWorld().addObject(new Label(s,25),370,y2);
      setI(i);
      setJ(j);
       getWorld().addObject(new Label("values: Pass="+i+" J="+j,20),650,y2-25);
      return;  
     }
  setValues(values);
  y2=y3+65;
  getWorld().addObject(new Label("sorting done",30),350,y2); 
  return  ;
}

public int[] getValues()
{
    return this.values;
}
public void setValues(int[] value)
{ for(int i=0;i<4;i++)
    this.values[i]=value[i];
   
}
public void setI(int i)
{  if(this.j==3)
    this.i=i+1;
    else
    this.i=i;
   
}
public int getI()
{    
      return i;
  
}
public int getJ()
{      
    return this.j;
   
}
public void setJ(int j)
{  if(this.j==3)
    this.j=1;
   else 
   this.j=j+1;
}
}