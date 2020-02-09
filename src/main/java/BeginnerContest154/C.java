package BeginnerContest154;

import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.next());
        HashSet<String> set = new HashSet<String>();
        boolean isContain = false;

        for (int n=0; n<i; n++){
            String s = sc.next();
            if(!set.add(s)){
                isContain = true;
                break;
            }
        }

        if(isContain){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }
    }
}
