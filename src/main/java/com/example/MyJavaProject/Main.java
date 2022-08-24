package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        a전사.나이++;
        a전사.자기소개();
        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.

    }
}
class 전사 {
    String 이름;
    int 나이;

    무기 a무기;

    void 자기소개() {
        System.out.printf("안녕하세요 저는 %d살 %s입니다.\n", 나이, 이름);
    }

    void 공격(){
        a무기.전사이름 = this.이름;
        a무기.무기로_공격();

    }

}

class 무기 {
    String 장비;
    String 전사이름;
    void 무기로_공격() {
        System.out.printf("%s(이)가 %s로 공격합니다.\n", 전사이름, 장비);
    }

}


class 칼 extends 무기 {

    칼() {
        장비 = "칼";
    }

}

class 활 extends 무기 {

    활() {
        장비 = "활";
    }

}
