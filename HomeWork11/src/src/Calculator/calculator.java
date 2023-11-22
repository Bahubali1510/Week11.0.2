package Calculator;

public class calculator {
    int a;
    int b;
    char symbols;


        public void addition()
    {
        System.out.println("Addition of two numbers" + (a+b));
        }

    public void subtraction()
    {
        System.out.println("Subtraction of two numbers" + (a-b));
    }

    public void multiplication()
    {
        System.out.println("Multiplication of two numbers" + (a*b));
    }

    public void division()
    {
        System.out.println("Division of two numbers" + (a/b));
        if (b != 0) {
            System.out.println("Division of " + a + " and " + b + " is: " + ((double) a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
public void calculateResult(){
            switch (symbols){
                case '+':
                    addition();
                    break;
                case '-':
                    subtraction();
                    break;
                case '*':
                    multiplication();
                    break;
                case '/':
                    division();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
}

    }

