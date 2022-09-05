
package com.example.MyJavaProject;

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
//        // 출력 => al.get(3) + al.get(4) : 1100
//
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
//

        System.out.println("==========================");
        al.showAllValues();
//        // 출력 =>
//            /*
//            == 전체 데이터 출력 ==
//            0 : 100
//            1 : 750
//            2 : 700
//            3 : 300
//            4 : 400
//            5 : 500
//            6 : 600
//            */
    }
}

class ArrayList {

    int[] MyList;

    int size;

    int count;

    ArrayList() {
        MyList = new int[2];

        size = 0;

        count = 0;
    }


    void add(int value) {

        if (size >= 2) {
            int[] newMylist = new int[MyList.length + size];

            for (int i = 0; i < MyList.length; i++) {
                newMylist[i] = MyList[i];
            }
            MyList = newMylist;
        }

        MyList[size] = value;
        size++;
    }

    void add(int value, int index) {


        if(size >= MyList.length){

        }
        size ++;
    }

    int size() {

        return size;
    }

    int get(int index) {
        return MyList[index];
    }

    void showAllValues() {

        for (int i = 0; i < size; i++) {
            System.out.printf("%d : %d \n", i, get(i));
        }

    }

    void removeAt(int index) {

       size--;

       for(int i = index; i < size; i++){
           MyList[i] = MyList[i+1];
       }

    }
}

