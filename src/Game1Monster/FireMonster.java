package Game1Monster;

public class FireMonster extends Monster {

    private int fireskillDamage; // 불속성스킬데미지


    public FireMonster(String name, int hp, int attack, int defense, int fireskillDamage) {
        super(name, hp, attack, defense); // Monster의 생성자 호출
        fireskillDamage = fireskillDamage;
    }


    public int getFireskillDamage() {
        return fireskillDamage;
    }

    public void setFireskillDamage(int fireskillDamage) {
        this.fireskillDamage = fireskillDamage;
    }

@Override
    public String toString() {
        return super.toString() + "불속성 스킬 데미지" + fireskillDamage;
    }
}
