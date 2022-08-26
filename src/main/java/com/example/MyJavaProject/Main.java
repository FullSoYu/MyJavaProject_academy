package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {


        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.
        a병사.공격();
        // 홍길동 이병이 공격합니다.(공격력 : 7)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 일병 입니다.
        a병사.공격();
        // 홍길동 일병이 공격합니다.(공격력 : 9)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 상병 입니다.
        a병사.공격();
        // 홍길동 상병이 공격합니다.(공격력 : 11)
    }
}

class 병사 {
    String 이름;
    int 계급_번호;

    병사() {
        계급_번호 = 1;
    }

    void 자기소개() {
        System.out.printf("안녕하세요. 저는 %s %s 입니다.\n", 이름, get계급명());
    }

    void 공격() {
        System.out.printf("%s %s(이)가 공격합니다.(공격력 : %d)\n",이름, get계급명(), get공격력());
    }

    String get계급명() {
        String 계급명 = null;
        if(계급_번호 == 1) {
            계급명 = "이병";
        } else if(계급_번호 == 2) {
            계급명 = "일병";
        } else if(계급_번호 == 3) {
            계급명 = "상병";
        }
        return 계급명;
    }

    int get공격력() {
        int 공격력=0;
        if(계급_번호 == 1) {
            공격력 = 7;
        } else if(계급_번호 == 2) {
            공격력 = 9;
        } else if(계급_번호 == 3) {
            공격력 = 11;
        }
        return 공격력;
    }

    void 진급() {
        계급_번호++;
    }

}
