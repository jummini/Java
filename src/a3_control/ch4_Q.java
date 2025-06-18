package a3_control;

public class ch4_Q {
    public static void main(String[] args) {

        // Q1
        int score = 72;

        if (score>=80 && score < 90) { // 80 <= score < 90
            System.out.println("B학점");
        } else if (score>=90) {System.out.println("A학점");
        } else if (score>=70 && score < 80) {
            System.out.println("C학점");
        } else {System.out.println("D학점");}

        // Q2
        // switch case문은 범위조건을 구현하기에 적합하지 않음
        // 그래서 점수를 10으로 나눠서 앞자리로 구분하는 방법 사용
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("A학점"); break;
            case 8:
                System.out.println("B학점");break;
            case 7:
                System.out.println("C학점"); break;
            default:
                System.out.println("F학점");
        }


    }
}
