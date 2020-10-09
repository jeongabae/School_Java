/*2020253059 전가배*/
package Practice4_05;

public class Calculator {
    int n1,n2; //숫자 1, 숫자 2
    String op; //연산자

    public Calculator(int n1, int n2) { //생성자
        this.n1 = n1;
        this.n2 = n2;
    }

    int add(int n1, int n2){return n1+n2;} //더하기 계산 메서드
    int subtract(int n1, int n2){return n1-n2;} //빼기 계산 메서드
    int multiply(int n1, int n2){return n1*n2;} //곱하기 계산 메서드
    double divide(int n1, int n2){return (double)n1/n2;} //나누기 계산 메서드
    double rest(int n1, int n2){return (double)n1%n2;} //나머지 계산 메서드
}
