
package com.example.MyJavaProject;

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : ages객체 put 메서드는 인자로 String, Integer 만 입력가능해야 합니다.
// 조건 : ages객체의 get 메서드는 Integer 를 리턴해야 합니다.
// 조건 : everyone객체 put 메서드는 인자로 String, Object 만 입력가능해야 합니다.
// 조건 : everyone객체의 get 메서드는 Object 를 리턴해야 합니다.
class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("영희", 22);
        ages.put("철수", 23);
        ages.put("민서", 25);
        ages.put("철수", 27);
        ages.remove("영희");
        ages.put("광수", 27);
        ages.keySet();


//        for (String name : ages.keySet()) {
//            System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
//        }
        /* 출력결과 */
        // 이름 : 철수, 나이 : 27
        // 이름 : 민서, 나이 : 25
        // 이름 : 광수, 나이 : 27
        HashMap<String, Object> everyone = new HashMap<>();
        everyone.put("사람", new 사람());
        everyone.put("원숭이", new 원숭이());
        ((사람) everyone.get("사람")).말하다();
        // 출력 => 사람이 말합니다.
        ((원숭이) everyone.get("원숭이")).묘기를_부리다();
        // 출력 => 원숭이가 묘기를 부립니다.
    }
}

class HashMap<K, V> {

    int size;

    Object[] keys;

    Object[] values;

    HashMap() {

        size = 0;

        keys = new Object[2];

        values = new Object[2];
    }

    void put(K key, V value) {

        keys[size] = key;

        values[size] = value;

        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }

        size++;

        exArray();
    }

    void remove(K key) {

        size--;

        for (int i = getIndexkey(key); i < size; i++) {
            keys[i] = keys[i + 1];
            values[i] = values[i + 1];
        }


    }

    void keySet() {

        for (int i = 0; i < size; i++) {

            System.out.println("이름 : " + keys[i] + " 나이 : " + values[i]);

        }


    }

    V get(K key) {

        return (V) values[getIndexkey(key)];

    }

    int getIndexkey(Object key) {

        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }

    void exArray() {
        if (size == keys.length) {
            Object[] newKeys = new Object[keys.length * 2];
            Object[] newValues = new Object[values.length * 2];

            for (int i = 0; i < size; i++) {
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }
            keys = newKeys;
            values = newValues;
        }
    }

}

class 사람 {

    void 말하다() {
        System.out.println("사람이 말합니다.");
    }

}

class 원숭이 {

    void 묘기를_부리다() {
        System.out.println("원숭이가 묘기를 부립니다.");
    }

}