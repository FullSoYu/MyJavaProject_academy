package com.example.MyJavaProject;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String t = scanner.nextLine();

        int k = scanner.nextInt();

        int count = 0;

        String[] strArray = t.split("");


        if (k >= 100) {
            for (int i = 0; i < strArray.length - 2; i++) {
                int a_i = Integer.parseInt(strArray[i] + strArray[i + 1] + strArray[i + 2]);


                if (a_i <= k) {
                    count = count + 1;
                }
            }
        } else if (100 > k && k >= 10) {

            for (int i = 0; i < strArray.length - 1; i++) {

                int a_i = Integer.parseInt(strArray[i] + strArray[i + 1]);
                if (a_i <= k) {
                    count = count + 1;
                }
            }
        } else if (k < 10) {
            for (int i = 0; i < strArray.length; i++) {
                int A = Integer.parseInt(strArray[i]);
                if (A <= k) {
                    count = count + 1;
                }
            }
        }

        System.out.println(count);

    }
}
