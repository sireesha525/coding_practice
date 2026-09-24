import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            // Compare X, Y, and Z to find the maximum value
            if (x > Math.max(y, z)) {
                System.out.println("Setter");
            } else if (y > Math.max(x, z)) {
                System.out.println("Tester");
            } else {
                System.out.println("Editorialist");
            }
        }
    }
}