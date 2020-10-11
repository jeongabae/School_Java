package Practice4_07;

import java.util.Scanner; //To use Scanner class

/**
 * BMImain class
 * Note : 2020253059 JeonGaBae
 * Note : A program that calculates BMI (body mass index) by inputting the user's information.
 */
public class BMImain {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);   //Create object of Scanner class
        System.out.print("Enter: name1, age1, weight1(kg), height1(cm) : "); //User1 Information Input Guide
        BMI bmi1 = new BMI(scanner.next(), scanner.nextInt(),
                scanner.nextDouble(), scanner.nextDouble()); //user1 information

        System.out.print("Enter: name2, age2, weight2(kg), height2(cm) : "); //User2 Information Input Guide
        BMI bmi2 = new BMI(scanner.next(), scanner.nextInt(),
                scanner.nextDouble(), scanner.nextDouble()); //user2 information

        System.out.println("User1 BMI: "+bmi1.getBMI()); //Print user1's BMI index
        System.out.println("User1 Interpretation: "+bmi1.getInterpretation(bmi1.getBMI()));    //Print user1's interpretation
        System.out.println("User2 BMI: "+bmi2.getBMI());  //Print user2's BMI index
        System.out.println("User2 Interpretation: "+bmi2.getInterpretation(bmi1.getBMI()));    //Print user2's interpretation
    }
}
