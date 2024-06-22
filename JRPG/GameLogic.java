package JRPG;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private Character hero;
    private Character enemy;
    private Scanner scanner;
    private Random random;

    public GameLogic(Character hero, Character enemy){
        this.hero = hero;
        this.enemy = enemy;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }
    public void flee(){
        int choice;
        System.out.println("You fleed the battle.");
        System.out.println("Challenge the monster again?.");
        System.out.println("1.Yes\n2.End the game.");
        choice = scanner.nextInt();
        if(choice==1){
            startBattle();
        }
        else if(choice==2){
            System.out.println("Game Over");
            System.exit(0);
        }
    }
    public void startBattle() {
        
        System.out.println("Battle Start!");

        System.out.println(hero.getName() + " vs " + enemy.getName());

        while (hero.isAlive() && enemy.isAlive()) {
            playerTurn();
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName()+" is defeated!");
                hero.gainExperience(enemy.getEnemyEXP());
                break;
            }

            enemyTurn();
            if (!hero.isAlive()) {
                System.out.println("You are defeated! Game over!");
                break;
            }
            displayStatus();
        }
    }

    private void playerTurn() {
        hero.reset();
        System.out.println("\nYour turn:");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Flee");
        System.out.print("Choose an action: ");
        int choice = scanner.nextInt();
        System.out.println("\nHero's turn:");
        if (choice == 1) {
            hero.attack(enemy);
        } else if (choice == 2) {
            hero.defend();
        }else if (choice == 3) {
            flee();
        }
        else {
            System.out.println("Invalid choice. You lose your turn.");
        }
    }

    private void enemyTurn() {
        enemy.reset();
        System.out.println("\nEnemy's turn:");
        int enemyChoice = random.nextInt(2) + 1;
        if (enemyChoice == 1) {
            enemy.attack(hero);
        } else {
            enemy.defend();
        }
    }

    private void displayStatus() {
        System.out.println("\nStatus:");
        hero.status();
        enemy.status();
    }
}

