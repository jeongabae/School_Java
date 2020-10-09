import java.util.*;

public class Game {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 3개 중에서 입력하세요");
        while (true) {
            System.out.print("영수 : ");
            String youngSu = scanner.next();
            System.out.print("써니 : ");
            String sunny = scanner.next();

            if (youngSu.equals("가위")) {
                if (sunny.equals("바위")) {
                    System.out.println("승자는 써니이다.");
                } else if (sunny.equals("보")) {
                    System.out.println("승자는 영수이다.");
                } else if (sunny.equals("가위")) {
                    System.out.println("비겼다.");
                }
            } else if (youngSu.equals("바위")) {
                if (sunny.equals("가위")) {
                    System.out.println("승자는 영수이다.");
                } else if (sunny.equals("보")) {
                    System.out.println("승자는 써니이다.");
                } else if (sunny.equals("바위")) {
                    System.out.println("비겼다.");
                }
            } else if (youngSu.equals("보")) {
                if (sunny.equals("가위")) {
                    System.out.println("승자는 써니이다.");
                } else if (sunny.equals("바위")) {
                    System.out.println("승자는 영수이다.");
                } else if (sunny.equals("보")) {
                    System.out.println("비겼다.");
                }
            } else {
                System.out.println("잘못입력했다.");
            }
            return;
        }
    }
}