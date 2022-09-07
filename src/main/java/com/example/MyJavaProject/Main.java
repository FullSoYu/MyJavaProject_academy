
package com.example.MyJavaProject;

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : ArrayList 객체에서 내부적으로 int 배열을 사용해서 데이터를 저장해야 합니다.
// 조건 : int 배열의 초기 길이는 2 입니다.
// 조건 : 상황에 따라 배열의 길이는 자동으로 증가해야 합니다.
// 조건 : 엘리먼트(구성요소)를 하나 삭제하면 해당 요소 뒤의 요소들이 전부 앞으로 한칸씩 움직여야 합니다.

//import java.util.ArrayList;
//
class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 0

        al.add(100);

        System.out.println("al.get(0) : " + al.get(0));
        // 출력 => al.get(0) : 100

        al.add(200);
        al.add(300);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 3

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 200

        al.removeAt(1);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 2

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 300

        al.add(400);
        al.add(500);
        al.add(600);

        System.out.println("al.get(3) + al.get(4) : " + (al.get(3) + al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		*/

        al.add(700, 1);
        al.add(750, 1);

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		*/
    }
}

class ArrayList {

    int[] A;

    int size;

    ArrayList() {
        A = new int[3];
        size = 0;
    }

    int size() {
        return size;
    }

    void add(int value) {


        A[size] = value;
        size++;
        exArrray();
    }

    void add(int value, int index) {


        exArrray();

        for (int i = size; i > index; i--) {
            A[i] = A[i -1];
        }

        A[index] = value;
        size++;

    }

    int get(int index) {
        return A[index];
    }

    void removeAt(int index) {

        size--;

        for (int i = index; i < size; i++) {
            A[i] = A[i + 1];
        }

    }

    void showAllValues() {
        System.out.println("===출력===");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d : %d\n", i, A[i]);
        }

    }

    void exArrray() {

        if (size == A.length) {
            int[] AA = new int[A.length * 2];


            for (int i = 0; i < A.length; i++) {
                AA[i] = A[i];
            }
            A = AA;
        }

    }

}