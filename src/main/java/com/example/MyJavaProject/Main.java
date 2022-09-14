
package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.id = 20;

        System.out.println("제 번호는 " + a사람.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

class 사람 {
    public int id;
}