package Game1Monster;

public class Monster {
        private String name; // 이름
        private int hp; // 체력
        private int maxHp; // 최대 체력
        private int attack; // 공격력
        private int defense; // 방어력



    public Monster() {
    }

    public Monster(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public void info() {
        System.out.println("이름: " + name + ", 체력: " + hp + "/" + maxHp + ", 공격력: " + attack + ", 방어력" + defense);

    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }


//    public static void main(String[] args) {
//        Monster slime1 = new Monster("slime1",50,5,1);
//        slime1.info();
//    }
//

}
