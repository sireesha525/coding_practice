import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num==0){
	    System.out.println(1);
	}
	else{
	    int factorial=1;
	    do{
	        factorial*=num;
	        num--;
	        }while(num>0);
	        System.out.println(factorial);
	    }
	    
	}
}
