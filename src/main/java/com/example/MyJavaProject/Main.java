package com.example.MyJavaProject;


public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        System.out.printf("저는 %d번 사람 %s입니다.%n", a사람.번호, a사람.이름);
        // 저는 -1번 사람 이름없음입니다.
        a사람.번호 = 1;
        a사람.이름 = "홍길동";
        System.out.printf("저는 %d번 사람 %s입니다.%n", a사람.번호, a사람.이름);

        사람 b사람 = new 사람(0,"무명");
        System.out.printf("저는 %d번 사람 %s입니다.%n", b사람.번호, b사람.이름);
    }
}

class 사람 {      //초기 값 넣어주기 단,
    int 번호;         //int = -1
    String 이름;      //String = "이름 없음" 이렇게 하지말고 풀어보기

    //생성자 생성
    사람(){
        this.이름 = "이름 없음";
        this.번호 = -1;
    }
    //생성자 오버로딩
    사람(int 번호, String 이름){
        this.번호 = 번호;
        this.이름 = 이름;
    }


}
