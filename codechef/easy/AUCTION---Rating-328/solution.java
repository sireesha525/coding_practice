import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0; i<t;i++){
		    int x=sc.nextInt();
		if(x<3){
		    System.out.println("LIGHT");
		}
		else if(x<7){
		    System.out.println("MODERATE");
		}
		else{
		    System.out.println("HEAVY");
		}                                                         
	}  
	sc.close();

	}
}
