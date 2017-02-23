import greenfoot.*;
import java.util.List;

public class SelectionSortStepButton extends Button
{
 int[] values={46,92,65,24};
   boolean done=false,once=true;
   int i=0;
   int j=1; int min=0;
   List<Obj> array;
    
    public void act() 
    {  if(Greenfoot.mouseClicked(this)&&once){ array=getWorld().getObjects(Obj.class); once=false;}
        if(Greenfoot.mouseClicked(this)&&!done)
       {  List<Label> l= getWorld().getObjects(Label.class);
           getWorld().removeObjects(l);
           getWorld().addObject(new Label("SELECTION SORT-ALGORITHM",40,700,500),450,120);
           done=SelectionSort(getValues(),getI(),getJ());
        }
        if(Greenfoot.mouseClicked(this)&&done)
       {    String s="sorting is done";
           getWorld().addObject(new Label(s),450,450);
        }
    } 
    
    public boolean SelectionSort(int values[],int i, int j)
    {   
      if(j<4)
      {
        if (values[j]<values[min])
        {
             min=j;
          setJ(j);
           return false;     
        }
        if(values[j]>=values[min])
        {
            setJ(j);
          
                return false;
        }
       }
        if (j==4&&i<3)
        {   
            exchangeNumbers(min,i);
            swap (min,i);
            setI(i);setJ(j);
             Ipointer ipoint=(Ipointer)getWorld().getObjects(Ipointer.class).get(0);
             ipoint.move(55);
             setValues(values);
          return false;     
        }
          if (i==3)
        { return true;     
        }
        return false;
    }
    
    private void exchangeNumbers(int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        }
    
    
    public void swap(int i,int j)
    {  
        String s= array.get(i).getNumber() +" is swapped with "+ array.get(j).getNumber();
        getWorld().addObject(new Label(s),450,300);
        Obj ob1=array.get(i);
        Obj ob2=array.get(j);
      int move1=ob2.getX()-ob1.getX();
         ob1.move(move1);
        ob2.move(-move1);
         Obj temp=ob1;
         ob1=ob2;
         ob2=temp;
         array.set(i,ob1); array.set(j,ob2);
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
   min=i+1;
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
{  Jpointer jpoint=(Jpointer)getWorld().getObjects(Jpointer.class).get(0);
                
    if(this.j==4)
  {  Ipointer ipoint=(Ipointer)getWorld().getObjects(Ipointer.class).get(0);
      int x1=ipoint.getX();
      int x2=jpoint.getX();
      jpoint.setLocation(x1+50,115);
      this.j=this.i+1;}
   else 
  { this.j=j+1;
   jpoint.move(55);}
}
}