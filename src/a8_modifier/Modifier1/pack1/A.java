package a8_modifier.Modifier1.pack1;

public class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    // 외부패키지에서 읽을 수 없는 b,c,d는 public 메서드를 통해서만 엑세스 가능
    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " "); // protected 상속받았으므로 접근 가능
        System.out.print(c + " "); // default 외부패키지이므로 접근 불가
        System.out.print(d + " "); // private 외부클래스이므로 접근 불가
        System.out.println();
    }
}
