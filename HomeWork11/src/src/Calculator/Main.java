package Calculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator c= new calculator();

        char ch = 'Y';

        while (ch=='Y') {
            System.out.println("Enter first number");
            int num1 = sc.nextInt();

            System.out.println("Enter second number");
            int num2 = sc.nextInt();

            System.out.println(" Enter any symbols +, -, *, / : ");
            char symbols = sc.next().charAt(0);

        }
    }
}