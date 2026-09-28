import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int z = scanner.nextInt();
                
                // Total minutes needed for assignments
                int totalMinutesNeeded = x * y;
                
                // Total minutes available in Z days (Z * 24 hours * 60 minutes)
                int totalMinutesAvailable = z * 24 * 60;
                
                // Check if Chef can complete the assignments in time
                if (totalMinutesNeeded <= totalMinutesAvailable) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        scanner.close();
    }
}