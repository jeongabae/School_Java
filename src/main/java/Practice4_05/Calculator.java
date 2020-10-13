
package Practice4_05;

/**
 * Calculator class
 * Note : 2020253059 JeonGaBae
 */
public class Calculator {
    int n1, n2; //number 1, number 2

    /**
     * Constructor
     * @param n1 : number type is integer
     * @param n2 : number type is integer
     */
    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /**
     * add method
     * Note : Perform Plus Calculation
     * @return n1+n2;
     */
    int add() {
        return n1 + n2;
    }

    /**
     * subtract method
     * Note : Perform subtract Calculation
     * @return n1-n2;
     */
    int subtract() {
        return n1 - n2;
    }

    /**
     * multiply method
     * Note : Perform multiply Calculation
     * @return n1*n2;
     */
    int multiply() {
        return n1 * n2;
    }

    /**
     * divide method
     * Note : Perform divide Calculation
     * @return n1/n2;
     */
    double divide() {
        return (double) n1 / n2;
    }

    /**
     * rest method
     * Note : Perform rest Calculation
     * @return n1%n2;
     */
    double rest() {
        return (double) n1 % n2;
    }
}
