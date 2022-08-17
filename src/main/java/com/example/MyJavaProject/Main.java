package com.example.MyJavaProject;


public class Main {
    public static void main(String[] args) {

        청동오리 a청동오리 = new 청동오리();
        a청동오리.날다();
        a청동오리.수영하다();

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.수영하다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.수영하다();

        고무오리2 a고무오리2 = new 고무오리2();
        a고무오리2.날다();
        a고무오리2.수영하다();

        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다();
        a로봇오리.수영하다();


    }
}


class 오리 {
    void 날다 (){
        System.out.println("오리가 날개로 날아갑니다.");
    }
    void 수영하다(){
        System.out.println("오리가 물갈퀴로 수영합니다.");
    }
}

class 청동오리 extends 오리{

}

class 흰오리 extends 오리{

}

//메서드 오버라이딩
class 고무오리 extends 오리{
    void 날다 (){     // 부모 클래스에서 선언한 메소드를 사용안하고 자식 클래스의 메소드로 사용하는 것을 오버라이딩이라고 함.
        System.out.println("저는 날 수 없어요. ㅠㅠ");
    }
    void 수영하다 (){
        System.out.println("오리가 물에 둥둥 떠다닙니다.");
    }
}

class 고무오리2 extends 고무오리 {

}

class 로봇오리 extends 오리{

}