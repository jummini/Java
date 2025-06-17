package a2_operator;

public class lifeCycle {
    public static void main(String[] args) {
        // 변수의 생명주기
        //중괄호{}로 감싸진 블록 범위에 따라 결정된다
        /*
        1. 지역 변수: 메서드, if문, for문 등의 {} 블록 내부
        - 해당 블록이 실행될 때 생성되고 블록 종료시 즉시 소멸

         */
        int x = 100;
        if(true) {
            { int y = 50; }    // 이런 의미없는 중괄호도 만들어도 괜찮음. 새로운 라이프 사이클을 만들어줌
            int y = 40;
        }
        int y = 60;   //중괄호때문에 새로운 y만들 수 있음.
        System.out.println(x); // 100
        System.out.println(y); // 60

    }
}
