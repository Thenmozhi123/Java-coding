package work;

import java.util.Scanner;

public class Second_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find second maximum of an array:
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the element:");
		n=s.nextInt();
		System.out.println("enter the all element:");
             int a[]=new int[n];
             for(int i=0;i<n;i++)
             {
            	a[i]=s.nextInt(); 
             }
             for(int i=0;i<n;i++)
             {
            	 for(int j=i+1;j<n;j++)
            	 {
            		if(a[i]>a[j])
            		{
            			temp=a[i];
            			a[i]=a[j];
            			a[j]=temp;
            		}
            	 }
             }
             System.out.println("second maximum: "+a[n-2]);
	}

}
