package a3_control;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        // 문제1) 유저로부터 온도를 입력받은 후, 온도에 따라 코멘트를 출력하는 코드
        // 온도가 0도 미만이면 "날씨가 매우 춥습니다. 얼음이 생길 수 있습니다."
        // 15도 미만이면 "날씨가 쌀쌀합니다. 따뜻한 옷을 입으세요."
        // 25도 미만이면 "날씨가 온화합니다. 외출하기 좋은 날입니다."
        // 35도 미만이면 "날씨가 덥습니다. 시원한 음료를 드세요."
        // 35도 이상이면 "날씨가 매우 덥습니다. 무더위에 주의하세요!"


        Scanner scanner = new Scanner(System.in);
        System.out.println("오늘의 온도를 입력해주세요(숫자만): ");
        int C = scanner.nextInt();
        if (C < 0) {
            System.out.println("날씨가 매우 춥습니다. 얼음이 생길 수 있습니다.");
        } else if (C >= 0 && C < 15) {
            System.out.println("날씨가 쌀쌀합니다. 따뜻한 옷을 입으세요.");
        } else if (C >= 15 && C < 25){
            System.out.println("날씨가 온화합니다. 외출하기 좋은 날입니다.");
        }    else if (C >= 25 && C < 35) {
                System.out.println("날씨가 덥습니다. 시원한 음료를 드세요.");
        } else {
            System.out.println("날씨가 매우 덥습니다. 무더위에 주의하세요!");
        }

        scanner.close();


        // 문제2) 1부터 100까지의 숫자에서 3의 배수를 출력하는 코드

        for (int i=1; i<=100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "");
            }
        }

    }
}