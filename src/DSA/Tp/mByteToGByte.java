package Tp;

import java.util.Scanner;

public class mByteToGByte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long mb = sc.nextLong();
        double ans = 0;
        ans = mb / 1024;
        long reminder = mb%1000;
        System.out.println(reminder*0.01);
    }
}
