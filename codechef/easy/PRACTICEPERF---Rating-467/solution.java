import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        // Read 4 integers for the 4 weeks
        for (int i = 0; i < 4; i++) {
            int problems = scanner.nextInt();
            // Check if Chef solved at least 10 problems in the week
            if (problems >= 10) {
                count++;
            }
        }
        
        // Output the total number of weeks he met the target
        System.out.println(count);
        
        scanner.close();
    }
}
