package javapractice;

import java.util.Scanner;

public class Temp {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int digit = sc.nextInt();
            sc.nextLine();
            int digitLen = String.valueOf(digit).length();
            System.out.print(s1);
            int strLen = s1.length();
            int spaces = 15-strLen;

        }
        System.out.println("================================");

    }
}
