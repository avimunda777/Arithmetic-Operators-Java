                                /* Arithemetic Operator Example...! */
import java.util.Scanner;

class Arithemetic
{
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter two Numbers... ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("ADDITION "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Remainder "+(a%b));
    }
}