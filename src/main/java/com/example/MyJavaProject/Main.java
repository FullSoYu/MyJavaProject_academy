package com.example.MyJavaProject;

public class Main {
    public static void main(String[] args) {


    new 구구단출력기().작동();

    }
}

class 구구단출력기 {

    void 작동(){
        for (int i = 1; i <= 9; i ++){
            System.out.printf("== %d단 ==\n", i);
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
