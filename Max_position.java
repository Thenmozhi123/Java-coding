package work;

import java.util.Scanner;

public class Max_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find maximum of an array and its position:
		int a[]={1,2,3,2,3};
           int max=a[0];
           int position=0;
           for(int i=0;i<a.length;i++)
           {
        	   if(max<a[i])
        	   {
        		   max=a[i];
        		   position=i;
        	   }
           }
           System.out.println("maximum value: " +max); 
         
        System.out.println("position: " +position);
         
        
        
        
	} 
	
}
