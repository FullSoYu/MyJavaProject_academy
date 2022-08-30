package com.example.MyJavaProject;

// 문제 : 아래와 같이 출력 되도록 해보세요. 단 팔 클래스의 생성자는 사용할 수 없습니다. 변수 생성시 초기화(예를들면 int 길이 = 70;) 도 안됩니다. 즉 팔 클래스는 수정 할 수 없습니다.
class Main {
    public static void main(String[] args) {

        System.out.println("== 청둥오리객체 생성시작 ==");
        new 청둥오리();
        System.out.println("== 청둥오리객체 생성끝 ==");
		/* 출력
		== 청둥오리객체 생성시작 ==
		생물이 생성되었습니다.
		동물이 생성되었습니다.
		오리가 생성되었습니다.
		청둥오리 생성되었습니다.
		== 청둥오리객체 생성끝 ==
		*/
    }
}




}