package Practice4_07;

import java.util.Scanner; //To use Scanner class

/*2020253059 전가배*/
/*사용자의 정보를 입력받아 BMI(체질량지수)를 계산해주는 프로그램*/
public class BMImain {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);   //Scanner클래스의 객체 생성
        System.out.print("Enter: name1, age1, weight1(kg), height1(cm) : ");
        String name1 = scanner.next();           //사용자 이름 입력
        int age1 = scanner.nextInt();            //사용자 나이 입력
        double weight1 = scanner.nextDouble();   //사용자 몸무게 입력
        double height1 = scanner.nextDouble();   //사용자 키 입력
        BMI bmi1 = new BMI(name1, age1, weight1, height1);
        double userBmi = bmi1.getBMI();

        System.out.print("Enter: name2, age2, weight2(kg), height2(cm) : ");
        String name2 = scanner.next();           //사용자 이름 입력
        int age2 = scanner.nextInt();            //사용자 나이 입력
        double weight2 = scanner.nextDouble();   //사용자 몸무게 입력
        double height2 = scanner.nextDouble();   //사용자 키 입력
        BMI bmi2 = new BMI(name2, age2, weight2, height2);
        double userBmi2 = bmi1.getBMI();

        System.out.println("User1 BMI: "+bmi1.getBMI());  //사용자의 BMI지수 출력
        System.out.println("User1 Interpretation: "+bmi1.getInterpretation(userBmi));    //사용자의 상태 출력
        System.out.println("User1 BMI: "+bmi1.getBMI());  //사용자의 BMI지수 출력
        System.out.println("User1 Interpretation: "+bmi1.getInterpretation(userBmi2));    //사용자의 상태 출력
        }

//    public static void inputUserInfo(){
//        Scanner scanner = new Scanner(System.in);   //Scanner클래스의 객체 생성
//        String name = scanner.next();           //사용자 이름 입력
//        int age = scanner.nextInt();            //사용자 나이 입력
//        double weight = scanner.nextDouble();   //사용자 몸무게 입력
//        double height = scanner.nextDouble();   //사용자 키 입력
//    }
}
