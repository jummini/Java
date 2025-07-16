package Game1Monster;

import java.util.Random;

public class NormalMonster extends Monster {

    public NormalMonster(String name, int hp, int attack, int defense)  {
        super(name, hp, attack, defense); // 부모 클래스 생성자 호출
    }

    @Override
    public int attack(Monster target){
        Random rand = new Random();
        int damage;

        if (rand.nextInt(100) < 20) {   // 확률 20%로 치명타
            damage = getAttack() * 2;   // 방어력 무시
            System.out.println(getName()+ "의 치명타 공격! 방어력을 무시하고 "+ damage + "의 데미지!");
        }
        else {
            damage = getAttack() - target.getDefense();
            damage = Math.max(damage, 0);
        }
        return damage;
    }
}
