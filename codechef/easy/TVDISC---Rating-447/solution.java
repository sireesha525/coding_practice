import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()) return;
		int t = sc.nextInt();
		
		while (t-- > 0) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    int costFirst = a - c;
		    int costSecond = b - d;
		    
		    if (costFirst < costSecond) {
		        System.out.println("First");
		    } else if (costFirst > costSecond) {
		        System.out.println("Second");
		    } else {
		        System.out.println("Any");
		    }
		}
		sc.close();
	}
}