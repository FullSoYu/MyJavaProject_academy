package com.example.MyJavaProject;


public class Main {
    public static void main(String[] args) { // 변수 갯수 1개 a사람

        전사 a전사 = new 전사();
        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();

    }
}

class 전사 {
    int 나이;

   무기 a무기;
}

class 무기 {

}

class 활 extends 무기 {

}

class 칼 extends 무기{

}
