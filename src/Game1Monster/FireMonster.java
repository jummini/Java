package Game1Monster;

public class FireMonster extends Monster {

    private int fireskillDamage; // 불속성스킬데미지


    public FireMonster(String name, int hp, int attack, int defense, int fireskillDamage) {
        super(name, hp, attack, defense); // Monster의 생성자 호출
        this.fireskillDamage = fireskillDamage;
    }

    public int getFireskillDamage() {
        return fireskillDamage;
    }


    @Override
    public int getAttack() {
        // 원래 공격력 + 화염 스킬 데미지를 자동으로 포함
        return super.getAttack() + fireskillDamage;
    }

@Override
    public String toString() {
        return super.toString() + "불속성 스킬 데미지" + fireskillDamage;
    }
}
