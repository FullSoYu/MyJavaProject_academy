class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요. 저는 20살 칸입니다.
        a전사.나이++;
        a전사.자기소개();
        // 안녕하세요. 저는 21살 칸입니다.
        a전사.나이 = 30;
        a전사.이름 = "철수";
        a전사.자기소개();
        // 안녕하세요. 저는 30살 철수입니다.
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 철수가 활로 공격합니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 철수가 칼로 공격합니다.
    }
}