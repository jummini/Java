package a5_class;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankObject = new BankAccount("111-222-333", "steve", 10000);
        System.out.println(bankObject);
        if (bankObject.deposit(3000)) {
            System.out.println("입금성공");
            System.out.println(bankObject);
        } else {
            System.out.println("입금실패");
        }
        // 정상출금
        // 예외상황 (잔액보다 많은 출금)
        if (bankObject.withdraw(30000)) {
            System.out.println("출금성공");
            System.out.println(bankObject);
        }else {
            System.out.println("출금실패");
        }
    }
}
