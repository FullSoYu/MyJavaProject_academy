package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {

        사람 a김철수 = new 김철수();
        사람 a김영희 = new 김영희();

        a김철수.배달_음식_주문하다();
        // 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.

        a김영희.배달_음식_주문하다();
        // 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.

        a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
        a김영희.선호하는_음식의_매운정도 = "아주 매운";
        a김영희.선호하는_음식 = "짜장";

        a김영희.배달_음식_주문하다();
        // 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.

    }
}

