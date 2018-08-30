
package ThreadExample;

import java.util.Scanner;

public class Transact {
    static	Transact t=new Transact();
    static	Scanner sc=new Scanner(System.in);
	int current= 5000;
  	public void welcome() {
  		System.out.println(" ATM PROCESS");
		System.out.println("Your options are:");
		System.out.println("1:Deposit");
		System.out.println("2:With draw");
		System.out.println("3:Balance");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		if(choice==1 ||choice== 2 ||choice== 3 ){
			switch(choice){
			case 1:
				t.Deposit();
				break;
			case 2:
				t.Withdraw();
				break;
			case 3:
				t.Balance();
				break;
		
			}
		}
			else{
		       System.out.println("You perform Wrong Operation: Only enter the number 1 to 3");
		       welcome();
			}
		}
  	void operation(){
		System.out.println("Do you want to continue again? please,Enter Y or y");
			char operation=sc.next().charAt(0);
			if(operation=='Y' || operation=='y'){
				t.welcome();
              }
		else if(operation=='Z' || operation=='z'){
			return;
		}
    else  {
    	
			System.out.println("You Should Perform Right Operation only");
		    t.operation();
		}
		}
	
	public void method(){
		 System.out.println("1.current_Account");
		 System.out.println("2.Savings");
		 System.out.println("Enter yours choice:");
		 int cho=sc.nextInt();
			if(cho==1 ||cho== 2 ){
				switch(cho){
				case 1:
					t.Current_Account();
					break;
				case 2:
					t.Savings();
					break;
				}
	}
			else{
			       System.out.println("You perform Wrong Operation: Only enter the number 1 to 3");
			       method();
			}
 }
    void Current_Account(){
			 System.out.println("Your current balance is:RS."+current);
			 t.operation();
		 }
	void Savings(){
		System.out.println("Enter a money you want:");
		t.check();
	}
		void check(){
			int a=sc.nextInt();
		if(a<=current){
			System.out.println(" !!!! Your Transaction is being processed..... withdraw successful  !!!! ");
			System.out.println("  Currently your balance is:Rs." +current);
			int b=current-a;
			System.out.println(" Now your balance is:Rs." +b);
			
		}
		
		else{
		System.out.println("please enter a valid number");
        Savings();
		}
	}
	
	void Deposit(){
		System.out.println("Welcome to Deposite");
		System.out.println("Enter you want to deposit amount:");
		t.debit();
	}
		void debit(){
		int a=sc.nextInt();
		if(a<=current){
			System.out.println("please wait:");
			int b=current+a;
			System.out.println("!!!!!  you deposit a money successfully   !!!!!");
			System.out.println("Now your available balance is:Rs:" +b);
		}
		else{
			System.out.println("!!!!you should deposit a money Rs:1 to Rs:30000 only!!!!");
		}
	}

	 void Withdraw(){
		System.out.println("Welcome to Withdraw");
		t.method();
	}
	void Balance(){
		System.out.println(" Now your balance is:Rs." +current);
	t.operation();
	}


	public static void main(String[] args){
		Transact tr=new Transact();
		t.welcome();

	}

}
