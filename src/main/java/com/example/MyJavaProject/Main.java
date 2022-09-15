package com.example.MyJavaProject;

class Main {
    public static void main(String[] args) {
        사람[] 사람들 = new 사람[7];
        사람들[0] = 사람.get사람();
        사람들[1] = 사람.get사람();
        사람들[2] = 사람.get사람();
        사람들[3] = 사람.get사람();
        사람들[4] = 사람.get사람();
        사람들[5] = 사람.get사람();
        사람들[6] = 사람.get사람();
        for ( int i = 0; i < 사람들.length; i++ ) {
            사람들[i].자기소개();
        }




        		/*
		// 출력
		저는 1번째 사람입니다.
		저는 2번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		*/
    }
}

