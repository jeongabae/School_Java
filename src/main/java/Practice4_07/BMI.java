package Practice4_07;
/** BMI class
 * Note : 2020253059 JeonGaBae
 */
public class BMI {
    private String name; //user name
    private int age; //user age
    private double weight,height; //user weight, height
    private String interpretation; //user interpretation

    /** Constructor
     * @param name
     * @param age
     * @param weight
     * @param height
     */
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    /** getBMI method
     * Note : reads the user's bmi value
     * @return weight /(height * height)
     */
    public double getBMI(){
        height = height/100; //Formula for indicating height in cm
        return  weight /(height * height); //Formula for BMI
    }

    /** getInterpretation method
     * Note : reads the user's interpretation
     * @param bmi
     * @return user's interpretation
     */
    public String getInterpretation(double bmi){
        if(bmi<18.5){                      //Underweight if bmi value is less than 18.5
            return "Underweight";
        }else if (18.5<=bmi && bmi<25.0){  //Normal if the bmi value is 18.5 or higher and less than 25.0
            return "Normal";
        } else if(25.0<=bmi && bmi<30.0){  //Overweight if bmi value is 25.0 or higher or less than 30.0
            return "Overweight";
        } else{                            //Obesity if bmi value is over 30.0
            return "Obese";
        }
    }

    /** setWeight
     * Note : Change the weight of a field
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** setHeight
     * Note : Change the Height of a field
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
