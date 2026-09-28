import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // The rebated amount is the minimum of the repair cost (y) and the limit (x)
            System.out.println(Math.min(x, y));
        }
        
        scanner.close();
    }
}