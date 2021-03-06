import java.util.Scanner;

public class omuk {
    public static void main(String[]args){
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        char[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 },
        };

        for(int i=1;i<SIZE;i++){
            board[0][i] = board[i][0] = (char)(i+'0');
        }
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("좌표 입력(종료는 00) : ");
            String input = scanner.nextLine();

            if(input.length() == 2){//두글자 입력시
                x = input.charAt(0) - '0'; //문자를 숫자로 변환
                y = input.charAt(1) - '0'; //문자를 숫자로 변환

                if(shipBoard[x-1][y-1] != 'O' || shipBoard[x-1][y-1] != 'X') {
                    board[x][y] = (char) (shipBoard[x-1][y-1] = 'O');

                }
                int a = (int)(Math.random()*SIZE);
                int b = (int)(Math.random()*SIZE);

                if(shipBoard[a-1][b-1] != 'O' || shipBoard[a-1][b-1] != 'X') {
                    board[a][b] = (char) (shipBoard[a-1][b-1] = 'X');

                }
                if(x==0 && y==0){ //00입력하면 종료하도록!!
                    break;
                }
            }
            if(input.length() != 2 || x<=0 || x >= SIZE || y <=0 || y >= SIZE){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }


            for(int i=0; i<SIZE; i++){
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
