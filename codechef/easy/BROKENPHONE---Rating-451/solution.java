import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            while (t-- > 0) {
                int x = scanner.nextInt(); // Cost of repair
                int y = scanner.nextInt(); // Cost of new phone

                // Compare costs and print the appropriate output
                if (x < y) {
                    System.out.println("REPAIR");
                } else if (x > y) {
                    System.out.println("NEW PHONE");
                } else {
                    System.out.println("ANY");
                }
            }
        }
        
        scanner.close();
    }
}