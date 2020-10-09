package Date9_25.package1;
import java.util.Scanner;

public class What {
    public static void main(String[]args){
        Circle pizza = new Circle();
        Circle cake = new Circle();
        Circle pizza1 = new Circle(10);

        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("너비와 높이 입력");
        rect.width=scanner.nextInt();
        rect.height=scanner.nextInt();

        System.out.println("사각형의 면적은"+rect.getArea());
        scanner.close();

        pizza.radius=10;
        pizza.name="슈프림";

        double area = pizza.getArea();

        cake.radius=10;
        cake.name = "초코";
        double area1 = cake.getArea();





    }
}
