package com.example.MyJavaProject;

// 문제 : 아래와 같이 출력 되도록 해보세요. 단 팔 클래스의 생성자는 사용할 수 없습니다. 변수 생성시 초기화(예를들면 int 길이 = 70;) 도 안됩니다. 즉 팔 클래스는 수정 할 수 없습니다.
class Main {
    public static void main(String[] args) {

        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5

    }
}

class 계산기 {

    int 더하기 (int x, int y) {
        return x + y;
    }

    int 더하기 (int x, int y, int r) {
        return x + y + r;
    }

    double 더하기 (double x, int y, int r) {
        return x + y + r;
    }
}
