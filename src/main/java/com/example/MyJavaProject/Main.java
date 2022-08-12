package com.example.MyJavaProject;

public class Main {
    public static void main(String[] args) {

        자동차 Porsche = new 자동차();
        Porsche.최고속력 = 230;
        Porsche.번호 = 1;

        자동차 BMW = new 자동차();
        BMW.최고속력 = 210;
        BMW.번호 = 2;

        Porsche.속력();
        BMW.속력();



    }
}

class 자동차 {

    int 최고속력;
    int 번호;
    void 속력 (){
        System.out.println(번호 +"번" + " 자동차가 최고속력 " + 최고속력  + "km로 달립니다.");
    }

}



