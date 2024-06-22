package JRPG;
public class RPG {
    public static void main(String[] args) {
        Story s = new Story("","");
        Character hero = new Hero ("Hero", 100, 50,0);
        Character enemyI = new Enemy("Imp", 60, 15,150);
        Character enemyII = new Enemy("Goblin", 120, 25,250);
        Character enemyIII = new Enemy("Hobgoblin", 150, 40,300);
        Character BOSS = new Enemy("Guardian Knight", 1100, 200,400);

        s.stageI();
        GameLogic stageI = new GameLogic(hero, enemyI);
        stageI.startBattle();
        s.stageII();
        GameLogic stageII = new GameLogic(hero, enemyII);
        stageII.startBattle();
        s.stageIII();
        GameLogic stageIII = new GameLogic(hero, enemyIII);
        stageIII.startBattle();
        s.stageIV();
        GameLogic stageIV = new GameLogic(hero, BOSS);
        stageIV.startBattle();
        if(!hero.isAlive()){
            System.exit(0);
        }
        else{
            s.Ending();
            System.exit(0);
        }
        
    }
}
