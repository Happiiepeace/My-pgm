import java.util.*;
public class Cars{
   
String model_name;
long reg_no;


void Cars(String name,long no)
{
    this.model_name=name;
    this.reg_no=no;
}
void displayCars()
{
    
    System.out.println("MODEL NAME:"+model_name);
    System.out.println("REGISTRATION NUMBER:"+reg_no);
    System.out.println("*****");
}

public static void main(String[] args)
{
    int i,n;
    Cars cr[] = new Cars[100];
    Scanner rn = new Scanner(System.in);
    System.out.println("Enter number of cars");
    n = rn.nextInt();
    for(i=0;i<n;i++)
        cr[i] = new Cars();
    for(i=0;i<n;i++)
    {
        
      
          System.out.format("Enter car %d Model Name\n",i+1);
          String model_name = rn.next();
          System.out.format("Enter car %d Registration Number\n",i+1);
          long reg_no = rn.nextLong();
          cr[i].Cars(model_name, reg_no);
    } 
      
      for(int m=0;m<n;m++)
      {
           System.out.println("*****");
         System.out.format("car %d details are:\n",m+1);
          cr[m].displayCars();
      }
    }  
}