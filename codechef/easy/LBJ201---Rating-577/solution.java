import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        
        for(int i = 0; i < t; i++){
            int A = read.nextInt();
            int C = read.nextInt();
            
            // If the sum of A and C is even, the integer B exists.
            // (A + C) % 2 == 0 checks if the sum is even.
            if ((A + C) % 2 == 0){
                int B = (A + C) / 2;
                System.out.println(B);
            } else {
                // If the sum is odd, no integer B exists.
                System.out.println(-1);
            }
        }
        read.close();
    }
}


