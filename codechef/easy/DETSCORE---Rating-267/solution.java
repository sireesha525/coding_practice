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
            int X = sc.nextInt();
            int N = sc.nextInt();
            // Each test case is worth X / 10 points. 
            // Multiply by N passed test cases.
            System.out.println((X / 10) * N);
        }
	}
}