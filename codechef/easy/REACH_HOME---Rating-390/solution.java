import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Check if Om's money + Gymkhana funds can cover the laptop's price
        if (n <= x + m) 
            System.out.println("YES");
        else 
            System.out.println("NO");
	}
}