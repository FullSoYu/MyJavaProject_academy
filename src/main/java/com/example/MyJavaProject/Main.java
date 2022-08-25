package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm

    }
}


class 사람 {

    사람() {
        a왼팔 = new 왼팔();
    }
    왼팔 a왼팔;

}

class 왼팔 {
    int 길이;

    왼팔() {
        길이 = 100;
    }
}