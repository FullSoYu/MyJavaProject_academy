package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {

        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
//        // 저는 1번, 홍길순, 33살 입니다.
//
        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.

    }
}

class 사람인력관리소 {

    int 인덱스증가용 = 1;

    사람 a사람1;
    사람 a사람2;
    사람 a사람3;


    void add사람(String 이름, int 나이) {         //추가하는 메소드

        int 인덱스 = 인덱스증가용;

        사람 a사람 = new 사람();
        a사람.이름 = 이름;
        a사람.나이 = 나이;
        a사람.번호 = 인덱스;

        System.out.printf("나이가 %s살인 %s번째 사람(%s)이 추가되었습니다.%n", 나이, 인덱스, 이름);
        if (인덱스 == 1) {
            a사람1 = a사람;
        } else if (인덱스 == 2) {
            a사람2 = a사람;
        } else if (인덱스 == 3) {
            a사람3 = a사람;
        }

        인덱스증가용++;


    }


    사람 get사람(int Num) {
        if (Num == 1) {
            return a사람1;
        } else if (Num == 2) {
            return a사람2;
        } else if (Num == 3) {
            return a사람3;
        }
        return null;
    }

}

class 사람 {              //사람 정보를 저장하는 클래스
    String 이름;
    int 번호;
    int 나이;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.%n", 번호, 이름, 나이);
    }

}
