package org.example.day6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < T; i++) {
            String myString = scan.nextLine();
            String even = "";
            String odd = "";
            for (int j = 0; j < myString.length(); j++) {
                if (j % 2 == 0){
                    even += myString.charAt(j);
                }else {
                    odd += myString.charAt(j);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
