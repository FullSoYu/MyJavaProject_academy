package com.example.MyJavaProject;

public class Main {
    public static void main(String[] args) {

        int 결과;

        결과 = 계산기.합(10, 20);
        System.out.println("결과 : " + 결과);

        결과 = 계산기.합(30, 20);
        System.out.println("결과 : " + 결과);

        결과 = 계산기.합(30, 70);
        System.out.println("결과 : " + 결과);

        결과 = 계산기.차(30, 70);
        System.out.println("결과 : " + 결과);

        결과 = 계산기.곱(3, 7);
        System.out.println("결과 : " + 결과);

    }
}

class 계산기 {

   static int 합 (int i, int j){
      return  i + j;
   }

    static int 차(int i, int j){
        return  i - j;
    }

    static int 곱(int i, int j){
        return  i * j;
    }
}
