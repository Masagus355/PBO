package JRPG;

public abstract class Character {
    public String name;
    int hp=100;
    int attack;
    boolean defend;
    int level;
    int experience;
    int experienceToLevelUp;
    int enemyexp;

    public Character(String name, int hp, int attack,int enemyxp) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defend = false;
        this.level = 1;
        this.experience = 0;
        this.experienceToLevelUp = 100;
        this.enemyexp=enemyxp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName(){
        return name;
    }
     public int getEnemyEXP(){
        return enemyexp;
     }
     public abstract void attack(Character opponent);

    /*public void attack(Character opponent) {
        int damage = attack;
        if (opponent.defend) {
            damage /= 2; // Reduce damage by 50% if the opponent is defending
            System.out.println(opponent.name + " takes reduced damage");
        }
        System.out.println(name + " attacks " + opponent.name + " for " + damage + " damage.");
        opponent.hp -= damage;
        opponent.defend = false;
    }
     */
    public void defend() {
        System.out.println(name + " is defending.");
        defend = true;
    }
    public void reset(){
        defend=false;
    }

    public void endTurn() {
        defend = false; // Reset defending status at the end of each turn
    }

    public void status() {
        System.out.println(name + ": " + hp + " HP");
    }
    public void gainExperience(int amount) {
        experience += amount;
        System.out.println(name + " gains " + amount + " experience points.");
        checkLevelUp();
    }

    private void checkLevelUp() {
        while (experience >= experienceToLevelUp) {
            experience -= experienceToLevelUp;
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        hp += 30;
        attack += 25;
        if(level>=3){
            hp+=50;
            attack+=30;
        }
        experienceToLevelUp += 50; // Increase the threshold for the next level up
        System.out.println(name + " leveled up! Level: " + level + ", HP: " + hp + ", Attack: " + attack);
    }
}

