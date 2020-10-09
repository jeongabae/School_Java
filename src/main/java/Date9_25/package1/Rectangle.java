package Date9_25.package1;

public class Rectangle {
    //필드
    int width,height;
    //생성자
    Rectangle(){
        width=1;
        height=1;
    }

    Rectangle(int w){
        width = w;
    }

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    //메소드
    double getArea(){
        return width*height;
    }
}
