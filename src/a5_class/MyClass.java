package a5_class;

public class MyClass {
    public static void main(String[] args) {
        // 학생클래스의 객체 생성
        Student steve = new Student("steve", 25) ;
        Student tom = new Student(); // 기본생성자
        Student sam = new Student("Sam", 29, "대전", "남", 100, 90, 80);
        System.out.println(steve.name); // steve
        System.out.println(tom.name); // null -> 문자의 0의 개념
        System.out.println(sam.name);

        // 객체생성후에 개별적으로 필드를 수정할 수 있음
        tom.name = "Tom";
        tom.age = 21;
        System.out.println(tom.name + " " + tom.age); // Tom 21

        // 성적조회
        double sumScoreSam = sam.sumScore(); // 메서드의 호출
        System.out.println(sumScoreSam); // 270.0
        double averageScoreSam = sam.averageScore();
        System.out.println(averageScoreSam); // 90.0
        // 중요! Sam의 성적을 알고 싶으면 Sam의 정보를 담고있는 객체의 메서드를 호출해야 함

    }
}

