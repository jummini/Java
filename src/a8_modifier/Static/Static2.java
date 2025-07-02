package a8_modifier.Static;

class B {
    int a;
    static int b;
    static void method() {
        System.out.println("정적메서드");
//        System.out.println(a); // 오류
        System.out.println(b); // 정상
    }
}

public class Static2 {
    // 정적메서드 (Static method)
    // 사용이유는?
    // 객체생성없이 바로 메서드를 호출하기 위해서 사용함
    // 예) 원의 면적 구하는 메서드, 주어진 배열을 정렬하는 메서드
    // 특정클래스의 상태와 유관한 메서드(월급을 계산하는 메서드)는 정적으로 만들지 않음
    // 클래스의 상태와 무관하게 주어진 매개변수만 처리하는 형태의 메서드는 정적으로 만들 수 있음
    public static void main(String[] args) {
        // 정적메서드는 객체를 생성해서 호출할 수 있지만 권장X
        B.method(); // 올바른 사용법
        B b = new B();
        b.method(); // 권장X

    }
}
