package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {

        사람 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

abstract class 사람 {

    String 이름;

    int 나이;

    사람인력관리소 a사람인력관리소;

    void add사람(String 이름, int 나이) {

        a사람인력관리소.명단("이름", 나이);
    }

    void 자기소개() {
        
    }
    
}

class 직업 extends 사람 {


    void 명단 (String 이름, int 나이) {
        String[] d = this.이름;
    }
    
}



class 사람인력관리소 extends 직업 {
    
}

