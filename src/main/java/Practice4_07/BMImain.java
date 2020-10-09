/*2020253059 전가배*/
/*사용자의 정보를 입력받아 BMI(체질량지수)를 계산해주는 프로그램*/
package Practice4_07;

import java.util.Scanner; //Scanner 클래스를 사용하기 위해 추가

public class BMImain {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);   //Scanner클래스의 객체 생성
        BMI [] bmi = new BMI[2];                    //BMI배열 선언(두 명의 사용자 정보를 저장하기 위함)
        for(int i=0; i<bmi.length; i++) {           //for문으로 사용자 정보를 입력받아 객체 생성하고 BMI지수와 상태를 출력
            System.out.printf("Enter: name%d, age%d, weight%d(kg), height%d(cm) : ",i+1,i+1,+i+1,i+1); //사용자 정보 입력 안내문
            String name = scanner.next();           //사용자 이름 입력
            int age = scanner.nextInt();            //사용자 나이 입력
            double weight = scanner.nextDouble();   //사용자 몸무게 입력
            double height = scanner.nextDouble();   //사용자 키 입력
            bmi[i] = new BMI(name, age, weight, height); //배열 원소의 객체 생성
            System.out.println("User"+(i+1)+" BMI: "+bmi[i].getBMI());  //사용자의 BMI지수 출력
            System.out.println("User"+(i+1)+" Interpretation: "+bmi[i].getInterpretation());    //사용자의 상태 출력
        }
    }
}
