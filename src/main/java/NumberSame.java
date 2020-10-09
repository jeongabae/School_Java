/*
1. Scanner 클래스를 이용하여 2자리의 정수(10~99)사이를 입력받고, 십의 자리와 1의 자리가 같은지 판별하는 프로그램
예) 2자리 정수입력 : 88
Yes, 10의자리와 1의 자리수가 같다.
 */
import java.util.Scanner;

public class NumberSame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리 정수 입력 : ");
        int num = scanner.nextInt();
        if (num <10 || num>99){
            System.out.println("10~99사이의 정수만 허용");
            scanner.close();
            return;
        }
        int a = num / 10; //10의 자리 숫자 (몫)
        int b = num % 10; //1의 자리 숫자

        if(a==b)
            System.out.print("Yes, 10의 자리와 1의 자리수가 같다. ");
        else
            System.out.print("No, 10의 자리와 1의 자리가 다르다. ");

        scanner.close();
    }
}