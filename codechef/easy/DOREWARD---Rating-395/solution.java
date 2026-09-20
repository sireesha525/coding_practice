import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        
        // Loop through each test case
        for (int t = 0; t < testcases; t++) {
            int x = sc.nextInt();
            
            // Check the conditions based on the number of donations
            if (x <= 3) {
                System.out.println("BRONZE");
            } else if (x <= 6) {
                System.out.println("SILVER");
            } else {
                System.out.println("GOLD");
            }
        }
        sc.close();
	}
}
