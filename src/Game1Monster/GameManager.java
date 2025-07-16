package Game1Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Game1Monster.NormalMonster;

public class GameManager {
    public static void main(String[] args) {
        List<Monster> monsters = new ArrayList<>();
        // 기본 몬스터
        monsters.add(new NormalMonster("슬라임", 30, 8, 5)); // 0 슬라임
        monsters.add(new NormalMonster("고블린", 50, 12, 4)); // 1 고블린
        monsters.add(new NormalMonster("오크", 80, 15, 7)); // 2 오크
        monsters.add(new NormalMonster("스켈레톤", 60, 14, 10)); // 3 스켈레톤
        monsters.add(new NormalMonster("트롤", 120, 18, 6)); // 4 트롤
        monsters.add(new NormalMonster("골렘", 100, 20, 25)); // 5 골렘
        monsters.add(new NormalMonster("와이번", 150, 25, 15)); // 6 와이번
        monsters.add(new NormalMonster("리치", 130, 35, 12)); // 7 리치
        monsters.add(new NormalMonster("키메라", 200, 30, 20)); // 8 키메라
        monsters.add(new NormalMonster("드래곤", 300, 40, 30)); // 9 드래곤

        // 화염 몬스터 추가
        monsters.add(new FireMonster("이프리트", 140, 22, 18, 35)); // 10 이프리트
        monsters.add(new FireMonster("헬하운드", 90, 28, 10, 25)); // 11 헬하운드
        monsters.add(new FireMonster("파이어 골렘", 180, 25, 22, 20)); // 12 파이어 골렘




        // 전투 몬스터 선택. m1의 선공
        Scanner scanner = new Scanner(System.in);
        System.out.println("선공 몬스터 번호: "); // 첫번째 몬스터 입력받기
        int index1 = scanner.nextInt();

        int index2;
        while (true) { // 두 몬스터는 같을 수 없다는 전제깔기
            System.out.println("후공 몬스터 번호: "); // 두번째 몬스터 입력받기
            index2 = scanner.nextInt();
            if (index2 != index1) break; // 같으면 break
            System.out.println("같은 몬스터는 선택이 불가능합니다.");
        }


        Monster m1 = monsters.get(index1);
        Monster m2 = monsters.get(index2);


        if (m1 instanceof FireMonster) {
            FireMonster fm1 = (FireMonster) m1;
            m1.setAttack(m1.getAttack() + fm1.getFireskillDamage());
            System.out.println(m1.getName() + "의 화염 스킬 발동! 추가 데미지 +" + fm1.getFireskillDamage());
        }
        if (m2 instanceof FireMonster) {
            FireMonster fm2 = (FireMonster) m2;
            m2.setAttack(m2.getAttack() + fm2.getFireskillDamage());
            System.out.println(m2.getName() + "의 화염 스킬 발동! 추가 데미지 +" + fm2.getFireskillDamage());
        }


        // 전투 시작
        while (m1.getHp() > 0 && m2.getHp() > 0) { // 둘 다 살아있을때, 전투 반복함
            int damagem2 = m1.getAttack() - m2.getDefense(); // 오크의 피해량 = 슬라임공격 - 오크방어

            if (damagem2 < 0) { // 피해량이 적다고 체력을 회복하면 안 됨
                damagem2 = 0;
            }
            int newHpoak = m2.getHp() - damagem2; // 오크의 새로운 체력이 생김 = 오크 체력 - 피해량
            m2.setHp(newHpoak); // 새로운 체력
            System.out.println(m1.getName() + "이(가) " + m2.getName() + "을(를) 공격했다! 데미지: " + damagem2);
            System.out.println(m2.getName() + "의 남은 체력: " + m2.getHp());

            try { // 1000 밀리초 = 1초 동안 실행을 멈춥니다.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // sleep 도중 방해를 받았을 때 처리할 코드를 여기에 작성할 수 있습니다.
                // 지금은 비워두어도 괜찮습니다.
                e.printStackTrace();
            }


            if (m2.getHp() <= 0) {
                break; // 오크의 체력이 0이 아니면 기회 주고 0이면 바로 끝
            }


            int damagem1 = m2.getAttack() - m1.getDefense();
            if (damagem1 < 0) {
                damagem1 = 0;
            }
            int newHpslime = m1.getHp() - damagem1;
            m1.setHp(newHpslime);
            System.out.println(m2.getName() + "이(가) " + m1.getName() + "을(를) 공격했다! 데미지: " + damagem1);
            System.out.println(m1.getName() + "의 남은 체력: "+ m1.getHp());

            try {// 1000 밀리초 = 1초 동안 실행을 멈춥니다.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // sleep 도중 방해를 받았을 때 처리할 코드를 여기에 작성할 수 있습니다.
                // 지금은 비워두어도 괜찮습니다.
                e.printStackTrace();
            }
        }
        System.out.println("--------------!!--------------");


        if (m1.getHp() <= 0) {
            System.out.println(m2.getName() + "이(가) 승리했다!"); // 만약 m1 의 체력이 먼저 0이나 이하면 m2 승리
        } else {
            System.out.println(m1.getName() + "이(가) 승리했다!"); // 만약 m2 의 체력이 먼저 0이나 이하면 m1 승리
        }


    }
}
