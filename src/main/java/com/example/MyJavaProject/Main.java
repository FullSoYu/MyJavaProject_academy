package com.example.MyJavaProject;


public class Main {
    public static void main(String[] args) {

        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 출력 : 브라이언(이)가 칼(으)로 공격합니다. 파라미터 사용
        a전사.재공격();
        // 출력 : 브라이언(이)가 칼(으)로 공격합니다. 파라미터 사용 불가
        a전사.공격("필립", "창");
        // 출력 : 필립(이)가 창(으)로 공격합니다. 파라미터 사용
        a전사.공격("마크", "지팡이");
        // 출력 : 마크(이)가 지팡이(으)로 공격합니다. 파라미터 사용
        a전사.재공격();
        // 출력 : 마크(이)가 지팡이(으)로 공격합니다. 파라미터 사용 불가
        a전사.재공격();
        // 출력 : 마크(이)가 지팡이(으)로 공격합니다. 파라미터 사용 불가
    }
}

class 전사 {
    String 이름;
    String 무기;
    void 공격(String 이름, String 무기) {
        this.이름 = 이름;
        this.무기 = 무기;
        System.out.printf("%s(이)가 %s(으)로 공격합니다.%n", 이름, 무기);
    }
    void 재공격(){
        System.out.printf("%s(이)가 %s(으)로 공격합니다.%n", 이름, 무기);
    }
}

