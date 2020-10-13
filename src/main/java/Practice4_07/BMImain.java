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
        double user1Bmi = bmi1.getBMI(); //user1 bmi

        System.out.print("Enter: name2, age2, weight2(kg), height2(cm) : "); //User2 Information Input Guide
        BMI bmi2 = new BMI(scanner.next(), scanner.nextInt(),
                scanner.nextDouble(), scanner.nextDouble()); //user2 information
        double user2Bmi = bmi2.getBMI(); //user2 bmi
        System.out.println("User1 BMI: "+user1Bmi); //Print user1's BMI index
        System.out.println("User1 Interpretation: "+bmi1.getInterpretation(user1Bmi));    //Print user1's interpretation
        System.out.println("User2 BMI: "+user2Bmi);  //Print user2's BMI index
        System.out.println("User2 Interpretation: "+bmi2.getInterpretation(user2Bmi));    //Print user2's interpretation
        scanner.close();
    }
}
