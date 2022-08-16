package com.example.MyJavaProject;

public class Main {
    public static void main(String[] args) {


   계산기.더한결과를_화면에_출력(10,20);

   계산기.더한결과를_화면에_출력(50,20);

   계산기.뺀결과를_화면에_출력(50,20);

   계산기.뺀결과를_화면에_출력(5,2);

   계산기.곱한결과를_화면에_출력(5,2);

   계산기.나눗셈을_화면에_출력(5,2);
    }
}

class 계산기 {
   static void 더한결과를_화면에_출력 (int i, int j){
       System.out.println("덧셈 출력 = > 결과 : " + (i + j));
    }

    static void 뺀결과를_화면에_출력(int i, int j){
        System.out.println("뺄셈 출력 = > 결과 : " + (i - j));
    }

    static  void 곱한결과를_화면에_출력(int i, int j){
        System.out.println("곱셈 출력 = > 결과 : " + (i * j));

    }
    static void 나눗셈을_화면에_출력(float i, float j){
        System.out.println("나눗셈 출력 = > 결과 : " + (i / j));
    }
}
