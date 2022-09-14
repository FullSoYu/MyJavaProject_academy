
package com.example.MyJavaProject;

// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        // 구현시작

        //
        a사람.setid(20);

        System.out.printf("제 번호는 %d 입니다.\n", a사람.getid());
        // 구현끝
        // 출력 : 제 번호는 20 입니다.
    }
}

class 사람 {
    private int id;

    // 구현 시작
    public void setid(int num) {
        id = num;
    }


    public int getid() {
        return id;
    }

    // 구현
}