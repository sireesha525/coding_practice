import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // Check if the distance to home is less than or equal to the maximum travel distance
            if (y <= 5 * x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
	}
}