import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class InsertionSortStepbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsertionSortStepbutton extends Button
{
    /**
     * Act - do whatever the InsertionSortStepbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int[] values={86,92,35,24};
   boolean done=false,once=true;
   int i=1,k;
   int j=1; int min=0;
   int y3=156,y2;
    int current=1,currentElement;
    public void act() 
    { 
       
        if(Greenfoot.mouseClicked(this)&&!done)
       {  
           done=InsertionSort(getValues(),getI(),getJ());
        }
        if(Greenfoot.mouseClicked(this)&&done)
       { y2=y3+65;
          getWorld().addObject(new Label("sorting done",25),370,y2); 
        }
    } 
     public boolean InsertionSort(int[] values, int i,int j){
         
        int temp;
       if(i<values.length)
           {
            if(j==0){setI(i);setJ(i+2);
                String s=values[0]+"    "+values[1]+"    "+values[2]+"    "+values[3];
                  y2=y3+65;
                  getWorld().addObject(new Emptyarray(),348,y2);
                  y3=y2;
                  getWorld().addObject(new Label(s,25),370,y2);
                  getWorld().addObject(new Label("i:"+i+" j:"+j,25),650,y2);
                  return false; }
                if(j>0){
                 
                 if(values[j] >= values[j-1])
                 {String s=values[0]+"    "+values[1]+"    "+values[2]+"    "+values[3];
                  y2=y3+65;
                  getWorld().addObject(new Emptyarray(),348,y2);
                  y3=y2;
                  getWorld().addObject(new Label(s,25),370,y2);getWorld().addObject(new Label("i:"+i+" j:"+j,25),650,y2);
                  }
                if(values[j] < values[j-1]){
                    temp = values[j];
                    values[j] = values[j-1];
                    values[j-1] = temp;
                    String s=values[0]+"    "+values[1]+"    "+values[2]+"    "+values[3];
                    y2=y3+65;
                    getWorld().addObject(new Emptyarray(),348,y2);
                    y3=y2;
                    getWorld().addObject(new Label(s,25),370,y2);getWorld().addObject(new Label("i:"+i+" j:"+j,25),650,y2);
                    getWorld().addObject(new Label(values[j-1]+" and "+values[j]+"are swapped",20),650,y2+30);
                }
                setJ(j);return false;
            }
           
           }
           if(i==values.length) return true; 
       return false; 
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
{   
    this.i=i+1;
 
    
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
{  if(j==0)
    {   
        this.j=this.i;
    }else{
        
       this.j=j-1;}
}
 }   
    
    

