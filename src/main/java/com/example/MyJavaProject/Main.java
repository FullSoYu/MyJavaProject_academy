package com.example.MyJavaProject;


public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.이름 = "칸";
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요. 저는 20살 칸입니다.
        a전사.나이++;
        a전사.자기소개();
        // 안녕하세요. 저는 21살 칸입니다.
        a전사.나이 = 30;
        a전사.이름 = "철수";
        a전사.자기소개();
        // 안녕하세요. 저는 30살 철수입니다.
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 철수가 활로 공격합니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 철수가 칼로 공격합니다.


    }
}

class 전사 {
    String 이름;
    int 나이;

    무기 a무기;

    void 자기소개 (){
        System.out.printf("안녕하세요 저는 %d살 %s입니다.%n", 나이, 이름);
    }

    void 공격 (){
        this.a무기.공격(이름);
    }
}

class 무기 {
    void 공격 (String 이름) {
        System.out.println(이름 + "(이)가 공격합니다.");
    }

}


class 칼 extends 무기 {

    void 공격 (String 이름) {
        System.out.println(이름 + "(이)가 칼로 공격합니다.");
    }
    
}

class 활 extends 무기 {

    void 공격 (String 이름) {
        System.out.println(이름 + "(이)가 활로 공격합니다.");
    }
}

