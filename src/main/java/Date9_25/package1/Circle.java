package Date9_25.package1;

public class Circle {
    String name; //null;
    int radius; //0

    //생성자
    Circle(int r){
        radius = r;
    }

    Circle() {}//기본 생성자 , 생성자는 오버로딩이 가능

    double getArea(){
        return 3.14*radius*radius;
    }
}
