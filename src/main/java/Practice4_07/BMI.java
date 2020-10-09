package Practice4_07;
/*2020253059 전가배*/

public class BMI {
    private String name; //user name
    private int age; //user age
    private double weight,height; //사용자 몸무게, 키
    private String interpretation; //사용자 상태

    /** Constructor
     *
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

    public double getBMI(){ //사용자의 bmi 값을 읽는 메서드
        height = height/100; //height를 cm단위로 나타내기 위한 수식
        return  weight /(height * height); //BMI의 수식
    }

    public String getInterpretation(double bmi){ //사용자의 상태 값을 읽는 메서드
        if(bmi<18.5){                      //bmi값이 18.5미만일 경우 저체중
            return "Underweight";
        }else if (18.5<=bmi && bmi<25.0){  //bmi값이 18.5이상, 25.0 미만일 경우 정상
            return "Normal";
        } else if(25.0<=bmi && bmi<30.0){  //bmi값이 25.0이상, 30.0 미만일 경우 과체중
            return "Overweight";
        } else{                            //bmi값이 30.0이상일 경우 비만
            return "Obese";
        }
    }

    public void setName(String name) {//필드 중 name 변경
        this.name = name;
    }

    public void setAge(int age) { //필드 중 age 변경
        this.age = age;
    }

    public void setWeight(double weight) { //필드 중 weight 변경
        this.weight = weight;
    }

    public void setHeight(double height) { //필드 중 bmi 변경
        this.height = height;
    }
}
