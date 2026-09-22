import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Scanner for taking input
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()) {
		    int t = sc.nextInt();
		    while(t-- > 0) {
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        
		        // New profit = Original profit + (10% of initial selling price)
		        int newProfit = y + (x / 10);
		        
		        System.out.println(newProfit);
		    }
		}
		sc.close();
	}
}