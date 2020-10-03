package work;

public class Work_program {     
	public static void main(String[] args) {
		// given array 
		//to find output: 1357 2468
		String even = "", odd = "";
		int a[]={1,2,3,4,5,6,7,8};
		for (int i : a){
		    if ( i % 2 == 0)
		        even += i;
		    else
		        odd += i;
		}
		System.out.println(odd + " " + even);
	}
}
			
	
	
