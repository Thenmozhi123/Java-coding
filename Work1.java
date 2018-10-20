package Task2;

public class Work1 {
	
	
	void first(){
		int c=1;
		System.out.println(" 1.First Output:" );
		for(int i=0;i<3;i++)
		{
			if(true)
			{	
				System.out.print(c +" "+ (-c));
		    }
		}
    }
	
	void second(){
		int c=1;
		System.out.println(" 2.Second output:");
		for(int i=0;i<3;i++)
			
		{
			if(true)
			{
				
				System.out.print(c +" "+ (c) );
				System.out.print((-c )+" "+ (-c) );
		    }
		}
	}
      void reversearray(){
    	  int temp;
    	  int a[]={1,2,3,4};
    	  int n=a.length-1;
    	  System.out.println(" 3.Reverse of an array:" );
    	  for(int i=0;i<n/2;i++)
    	  {
    		  temp=a[i];
    		  a[i]=a[n-i];
    		  a[n-i]=temp;
    	  }
    	  for(int i=0;i<=n;i++)
    	  {
    		  System.out.println(a[i] );  
    	  }
      }
      void thirdvaraiable(){
    	  System.out.println(" 4.to swap a number without using 3rd variable:" );
    	  int a=90,b=77;
    	  a=a+b;
    	  b=a-b;
    	  a=a-b;
    	  System.out.println("a="+a);
    	  System.out.println("b="+b );
      }
      
      void fourth(){
    	  System.out.println("4.a.to swap a number without using 4th variable:" );
    	  int a=50,b=60,c=70;
    	  a=a+b+c;
    	  c=a-(b+c);
    	  b=a-(b+c);
    	  a=a-(b+c);      
     	  System.out.println("a="+a);
    	  System.out.println("b="+b );  
     	  System.out.println("c="+c);
      }
      void odd(){
    	  System.out.println(" 5.the odd number of positive and negative:" );
    	  int a=1,sum=0;
    	  for(int i=0;i<3;i++)
    	  {
    		  if(sum==0)
    		  {
    			  System.out.println(a);
    			  a=a+2;
    			  System.out.println(a );
    			  sum=1;
    			  
    		  }
    		  else
    		  {
    		  System.out.println(-a );
    		  a=a+2;
    		  System.out.println(-a );
    		  sum=0;
    		  }
    		  a=a+2;
    	  }
      }
	public static void main(String[] args) {
		Work1 work=new Work1();
		work.first();
		work.second();
	    work.reversearray();
		work.thirdvaraiable();  
		work.fourth();
		work.odd();
           }
}