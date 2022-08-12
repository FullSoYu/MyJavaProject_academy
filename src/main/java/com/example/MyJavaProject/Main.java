package com.example.MyJavaProject;

public class Main {
    public static void main(String[] args) {

        자동차 Porsche = new 자동차();
        Porsche.번호 = 1;


        자동차 BMW = new 자동차();
        BMW.번호 = 2;


        //1번 자동차가 230km/h 로 달립니다.
        //2번 자동차가 210km/h 로 달립니다.

        Porsche.달리다(230);
        BMW.달리다(210);
    }
}

class 자동차 {

    int 번호;

    void 달리다(int 최고속력){

        System.out.println(번호 + "번 자동차가 최고속력 " + 최고속력 + "km/h 으로 달립니다.");
    }

}


