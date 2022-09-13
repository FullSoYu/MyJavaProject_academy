
package com.example.MyJavaProject;


class Main {
    public static void main(String[] args) {
        사람 a사람 = new 홍길동();
        변호사 a변호사 = (변호사) a사람;
        치과의사 a치과의사 = (치과의사) a사람;
        성화봉송자 a성화봉송자 = (성화봉송자) a사람;
    }
}

interface 사람 {

}

interface 변호사 {

}

class 홍길동  implements 사람, 변호사, 치과의사, 성화봉송자 {

}

interface 치과의사 {

}

interface 성화봉송자 {

}