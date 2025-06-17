package a2_operator;

public class Test {
    public static void main(String[] args) {
        System.out.println("11111");
        System.out.println("11111");
        System.out.println("11111");
        System.out.println("11111");


        // 106p 연습 문제
        //Q1
        System.out.println(2 + 3 / 2);
        System.out.println(10 % 3 + 5 / 3);
        System.out.println((4 + 5 / 2) % 4);

        System.out.println(3 / 2);

        //Q2
        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);
        System.out.println(++b);
        System.out.println(a++ + --b);
        System.out.println(a + b);

        //Q3
        System.out.println(5 & 3);
        System.out.println(5 | 3);
        System.out.println(5 ^ 3);
        System.out.println(~5);


        //107p 연습문제
        //Q4
        System.out.println(7 << 2);
        System.out.println(7 >> 2);
        System.out.println(-7 << 2);
        System.out.println(-7 >> 2);
        System.out.println(-1 >>> 30);

        //Q5
        System.out.println(3 < 3);
        System.out.println(5 >= 3);
        System.out.println(5 <= 5);
        System.out.println(5 == 5);
        System.out.println(5 != 5);

        //Q6
        System.out.println(false && true);
        System.out.println((4 <= 4) || (6 < 3));
        System.out.println(false ^ ( 3 >= 4));
        System.out.println(!(3 <= 3));


    }
}

