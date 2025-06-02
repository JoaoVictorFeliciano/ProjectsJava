import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int num1= scanner.nextInt();

        System.out.println("Type the second number: ");
        int num2= scanner.nextInt();

        int soma = num1+num2;
        
        System.out.println("The sum of the numbers is: "+ (soma));


    }
}