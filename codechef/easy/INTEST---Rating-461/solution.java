import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
		    int n = sc.nextInt();
		    
		    // Get the last digit
		    int last = n % 10;
		    
		    // Get the first digit
		    int first = n;
		    while (first >= 10) {
		        first = first / 10;
		    }
		    
		    // Print the sum inside the loop for each test case
		    System.out.println(first + last);
		}
	}
}