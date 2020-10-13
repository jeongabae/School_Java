package Practice4_05;
import java.util.Scanner; //To use Scanner class

/**
 *  TestCalculator class
 * Note : 2020253059 JeonGaBae
 * Note : Calculator program to calculate by inputting number 1 operator number 2
 */
public class TestCalculator {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);   //Create object of Scanner class
        System.out.print("Enter: number1 OperationalSymbol(+, -, *, / , %) number2: "); //input guide
        int n1 = scanner.nextInt(); //input n1
        String op = scanner.next(); //input operator
        int n2 = scanner.nextInt(); //input n2
        Calculator calculator = new Calculator(n1,n2); //Create calculator object

        /**
         * Switch statement for different calculations depending on operator
         */
        switch (op) {
            case "+": //add
                System.out.println("Result: "+calculator.add());
                break;

            case "-": //subtract
                System.out.println("Result: "+calculator.subtract());
                break;

            case "*": //multiply
                System.out.println("Result: "+calculator.multiply());
                break;

            case "/": //divide
                System.out.println("Result: "+calculator.divide());
                break;

            case "%": //rest
                System.out.println("Result: "+calculator.rest());
                break;
            default: //etc
                System.out.println("Wrong Input");
        }
        scanner.close();
    }
}
