package JRPG;

public class Hero extends Character {
    public Hero(String name, int hp, int attack, int enemyexp) {
        super(name, hp, attack, enemyexp);
    }

    @Override
    public void attack(Character opponent) {
        System.out.println(name + " attacks " + opponent.getName() + "!");
        int damage = attack;
        if (opponent.defend) {
            damage /= 2; // Reduce damage by half if opponent is defending
            System.out.println(opponent.getName() + " defends the attack!");
        }
        opponent.hp -= damage;
        opponent.defend = false;
        System.out.println(opponent.getName() + " takes " + damage + " damage.");
    }
}

