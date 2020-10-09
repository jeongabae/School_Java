/*2020253059 전가배*/
package Practice4_07;

public class BMI {
    private String name; //사용자 이름
    private int age; //사용자 나이
    private double weight,height; //사용자 몸무게, 키
    private double bmi; //사용자 bmi
    private String interpretation; //사용자 상태

    public BMI(String name, int age, double weight, double height) { //생성자
        setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }


    public double getBMI(){ //사용자의 bmi 값을 읽는 메서드
        height = height/100; //height를 cm단위로 나타내기 위한 수식
        return bmi = weight /(height * height); //BMI의 수식
    }

    public String getInterpretation(){ //사용자의 상태 값을 읽는 메서드
        if(bmi<18.5){                      //bmi값이 18.5미만일 경우 저체중
            interpretation = "underweight";
        }else if (18.5<=bmi && bmi<25.0){  //bmi값이 18.5이상, 25.0 미만일 경우 정상
            interpretation = "normal";
        } else if(25.0<=bmi && bmi<30.0){  //bmi값이 25.0이상, 30.0 미만일 경우 과체중
            interpretation = "overweight";
        } else{                            //bmi값이 30.0이상일 경우 비만
            interpretation = "obese";
        }
        return interpretation; //사용자 상태값 리턴
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
