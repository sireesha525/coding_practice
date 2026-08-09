import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Calculate a + b, multiply by 10, and add 1 to append '1' at the end
        System.out.println(10 * (a + b) + 1);
	}
}