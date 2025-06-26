package a6_array;


public class Example2 {
    public static void main(String[] args) {
        // 주어진 배열의 평균값을 계산하는 메서드
        int[] numbers = {10,20,30,40,50};
        double average = getAverage(numbers);
        System.out.println(average);
    }
    public static double getAverage(int[] arr) {
        // 평균값을 구하려면 합계 / 갯수가 필요
        int sum = 0;
        for (int n : arr) {
            sum = sum + n;
        }
        double average = (double) sum / arr.length; // 하나가 더블이면(둘 다 더블이면) 더블로 나옴!
        return average;
    }
}
