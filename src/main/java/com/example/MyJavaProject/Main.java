package com.example.MyJavaProject;

// 문제 : 아래와 같이 출력 되도록 해보세요. 단 팔 클래스의 생성자는 사용할 수 없습니다. 변수 생성시 초기화(예를들면 int 길이 = 70;) 도 안됩니다. 즉 팔 클래스는 수정 할 수 없습니다.
class Main {
    public static void main(String[] args) {

        new 사과();
        // 사과가 만들어졌습니다.
        new 포도();
        // 포도가 만들어졌습니다.
        new 사람("홍길동");
        // 사람 홍길동이 만들어졌습니다.
        new 사람();
        // 사람이 만들어졌습니다.
    }
}

class 사과 {

    사과() {
        System.out.println("사과가 만들어졌습니다.");
    }

}

class 포도 {

    포도() {
        System.out.println("포도가 만들어졌습니다.");
    }

}

class 사람 {

    String 이름;

    사람() {
        System.out.println("사람이 만들어졌습니다.");
    }

    사람(String 이름) {
        this.이름 = 이름;
        System.out.printf("사람 %s이 만들어졌습니다.%n", 이름);
    }

}

