package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {

        전사 a전사 = new 전사();

        a전사.공격();
        // 칼(으)로 공격합니다.

        a전사.창_모드로_변경();

        a전사.공격();
        // 창(으)로 공격합니다.

        a전사.지팡이_모드로_변경();

        a전사.공격();
        // 지팡이(으)로 공격합니다.


    }
}

class 전사 {
    String 무기_이름;

    전사() {
        무기_이름 = "칼";
    }

    void 공격() {
        System.out.printf("%s(으)로 공격합니다.%n", 무기_이름);
    }

    void 창_모드로_변경(){
        무기_이름 = "창";
        System.out.printf("%s(으)로 공격합니다.%n", 무기_이름);
    }
    void 지팡이_모드로_변경() {
        무기_이름 = "지팡이";
        System.out.printf("%s(으)로 공격합니다.%n", 무기_이름);
    }
}


