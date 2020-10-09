/*2020253059 전가배*/
/*숫자1 연산자 숫자2를 입력받아 계산을 해주는 계산기프로그램*/
package Practice4_05;
import java.util.Scanner; //Scanner 클래스를 사용하기 위해 추가

public class TestCalculator {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);   //Scanner 클래스를 사용하기 위해 추가
        System.out.print("Enter: number1 OperationalSymbol(+, -, x, / , %) number2: "); //숫자1 연산자 숫자2 입력 안내문 출력
        int n1 = scanner.nextInt(); //숫자1 입력
        String op = scanner.next(); //연산자 입력
        int n2 = scanner.nextInt(); //숫자2입력
        Calculator calculator = new Calculator(n1,n2); //계산기 객체 생성

        switch (op) { // 연산자에 따라 계산을 달리하기 위한 switch문
            case "+": //더하기
                System.out.println("Result: "+calculator.add(n1, n2));
                break;

            case "-": //빼기
                System.out.println("Result: "+calculator.subtract(n1, n2));
                break;

            case "*": //곱하기
                System.out.println("Result: "+calculator.multiply(n1, n2));
                break;

            case "/": //나누기
                System.out.println("Result: "+calculator.divide(n1, n2));
                break;

            case "%": //나머지
                System.out.println("Result: "+calculator.rest(n1, n2));
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
