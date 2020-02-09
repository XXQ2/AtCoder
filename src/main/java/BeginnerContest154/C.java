package BeginnerContest154;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.next());
        sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Set<String> set = new HashSet<String>();
        boolean isContain = false;

        for (int n=0; n<i; n++){
            if(!set.add(s[n])){
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
