package a6_array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 문자열(String)의 배열만 가지는 특성
        String[] names1 = new String[5]; // 일반적인 방법
        String[] names2 = {"steve", "Tom", "Laura", "Sam", "Mike"}; // 리터럴방법
        // 참조자료형중 String만 리터럴 방식으로 배열을 생성할 수 있음
        // 기본자료형들은 리터럴 방식으로 배열을 생성할 수 있음
        System.out.println(Arrays.toString(names2));
    }
}
