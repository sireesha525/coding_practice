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
        int x = sc.nextInt();
        int y = sc.nextInt();

        int messiPoints = a * 2 + b;
        int ronaldoPoints = x * 2 + y;

        if (messiPoints > ronaldoPoints) {
            System.out.println("Messi");
        }
        else if (ronaldoPoints > messiPoints) {
            System.out.println("Ronaldo");
        }
        else {
            System.out.println("Equal");
        }
    }
}