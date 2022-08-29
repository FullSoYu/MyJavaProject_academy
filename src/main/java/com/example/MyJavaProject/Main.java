package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 문제 => 출력 = 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 문제 => 출력 = 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
        // 문제 => 출력 = 저는 랄 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
        // 문제 => 출력 = 저는 랄 수 없어요. ㅜㅠ
    }
}

class 오리 {
    비행아이템 a비행아이템;
    void 날다() {

        a비행아이템.작동();

    }
}

class 흰오리 extends 오리 {
    흰오리() {
        a비행아이템 = new 비행가능아이템();
    }
}

class 청둥오리 extends 오리 {
    청둥오리() {
        a비행아이템 = new 비행가능아이템();
    }
}

class 고무오리 extends 오리 {
    고무오리() {
        a비행아이템 = new 비행불가능아이템();
    }
}

class 고무2오리 extends 오리 {
    고무2오리() {
        a비행아이템 = new 비행불가능아이템();
    }
}

class 비행아이템 {
    void 작동() {

    }
}

class 비행가능아이템 extends 비행아이템{
    void 작동() {
        System.out.println("출력 : 오리가 날개로 날아갑니다.");
    }
}

class 비행불가능아이템 extends 비행아이템{
    void 작동() {
        System.out.println("출력 = 저는 못날아요.ㅜㅠ");
    }
}

    }
}