package BeginnerContest154;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int SN = Integer.parseInt(sc.next());
        int TN = Integer.parseInt(sc.next());
        String U = sc.next();

        if(S.equals(U)){
            SN--;
        }else if(T.equals(U)){
            TN--;
        }
        System.out.print(SN + " " + TN);
    }
}
