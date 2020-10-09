package Date9_25;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.*;

public class FriendName {
    public static void main(String[]args){
        //문자열만 삽입 가능한 ArrayList
        ArrayList<String> name_set = new ArrayList<>(); // var name_set = new ArrayList<String>();
        //키보드 입력
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<4;i++){
            String name = scanner.next();
            name_set.add(name); //ArrayList에 데이터 삽임
        }
        //출력
        for(int i=0;i<name_set.size();i++){
            String name = name_set.get(i);
            System.out.print(name+" ");
        }
        //가장 긴 이름 출력
        int long_index = 0;
        for(int i=0;i<name_set.size();i++){
            if(name_set.get(long_index).length() < name_set.get(i).length()){
                long_index = i;
            }
        }
        System.out.println("긴이름 : "+ name_set.get(long_index));
    }
}
