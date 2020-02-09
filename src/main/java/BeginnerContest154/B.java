package BeginnerContest154;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.replaceAll("[a-z]", "x"));

    }
}
