
package com.example.MyJavaProject;


class Main {
    public static void main(String[] args) {
        진찰하다(new 사람());
        // 출력 : 사람이 진찰합니다.
        진찰하다(new 원숭이());
        // 출력 : 원숭이가 진찰합니다.
        진찰하다(new 치타());
        // 출력 : 치타가 진찰합니다.
        진찰하다(new 기린());
        // 출력 : 기린이 진찰합니다.
        진찰하다(new 로봇());
        // 출력 : 로봇이 진찰합니다.
        진찰하다(new 삼성());
        // 출력 : 삼성이 진찰합니다.
        진찰하다(new LG());
        // 출력 : 삼성이 진찰합니다.
    }

    // 여기에 static 추가
    public static void 진찰하다(의사 a의사) {
        a의사.진찰();
    }
}

class 사람 {
    public void 진료() {
        System.out.println("사람이 진찰합니다.");
    }
}

class 원숭이 {
    public void 살펴보다() {
        System.out.println("원숭이가 진찰합니다.");
    }
}

class 치타 {
    public void 진찰() {
        System.out.println("치타가 진찰합니다.");
    }
}

class 기린 {
    public void 진찰() {
        System.out.println("기린이 진찰합니다.");
    }
}

class 로봇 {
    public void 오류감지() {
        System.out.println("로봇이 진찰합니다.");
    }
}

class 삼성 {
    public void 삼성병원에_진찰하라고_지시() {
        System.out.println("삼성이 진찰합니다.");
    }
}

class LG {
    public void 삼성병원에_진찰하라고_지시() {
        System.out.println("LG가 진찰합니다.");
    }
}