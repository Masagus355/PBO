package JRPG;
import java.util.Scanner;

public class Story {
    public String hero_name;
    public String proceed;
    public Scanner scans;

    public Story(String hero_name,String proceed){
        this.hero_name = hero_name;
        this.proceed = proceed;
        this.scans = new Scanner(System.in);
    }
    public String proceed(){
        return proceed;
    }
    public String getHero_name(){
        return hero_name;
    }
    public void Continue(){
        System.out.println("Press Enter to proceed");
    }
    public void stageI() {
        while (true) {
            try {
                System.out.println("Welcome to the game, please enter your name\n");
                hero_name = scans.nextLine();

                // Validate input (only alphabets allowed)
                if (!hero_name.matches("[a-zA-Z]+")) {
                    throw new InvalidInputException("Invalid input: Name must contain only alphabetic characters (A-Z, a-z). Please enter again.");
                }

                System.out.println("====================================");
                System.out.println("You are named " + getHero_name() + ".");
                System.out.println("====================================");
                Continue();
                scans.nextLine();
                System.out.println("===================================================================================================");
                System.out.println("The Kingdom of Arland has a monster outbreak beneath the capital city.");
                System.out.println("The King Advisor, Ser Harland suspects that the ancient crypt below the capital is the source of the outbreak.");
                System.out.println("===================================================================================================");
                Continue();
                scans.nextLine();
                System.out.println("===================================================================================================");
                System.out.println("The Hero " + getHero_name() + " is tasked by the King to investigate the ancient crypt below the kingdom.");
                System.out.println("With the promise of bountiful reward, the hero began its journey.");
                System.out.println("===================================================================================================");
                Continue();
                scans.nextLine();
                System.out.println("===================================================================================================");
                System.out.println("The Hero began its journey in the now Quarantined district of Veloza.");
                System.out.println("The city guards opened the gate to the district for the hero.");
                System.out.println("===================================================================================================");
                Continue();
                scans.nextLine();
                System.out.println("===================================================================================================");
                System.out.println("The district is in total disarray, corpses piling upon another like a mountain.");
                System.out.println("The smell of rotting corpse attracts many monsters.");
                System.out.println("===================================================================================================");
                Continue();
                scans.nextLine();
                System.out.println("===================================================================================================");
                System.out.println("There is one Monster munching on what seems to be a dismembered leg");
                System.out.println("The Monster is small, with a bloated head and pointy ears.");
                System.out.println("===================================================================================================");
                Continue();
                scans.nextLine();
                System.out.println("===================================================================================================");
                System.out.println("The Monster noticed you! It's an Imp!");
                System.out.println("Your very first clash began.");
                System.out.println("===================================================================================================");
                Continue();
                scans.nextLine();

                // If the name is valid, break out of the loop
                break;

            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
                // Optionally, handle the exception further (e.g., ask for input again)
            }
        }
    }
    public void stageII(){
       System.out.println("===================================================================================================");
       System.out.println("With the imp defeated, you continue on your quest.");
       System.out.println("You continue forward until you found a well.");
       System.out.println("===================================================================================================");
       Continue();
       scans.nextLine();
       System.out.println("===================================================================================================");
       System.out.println("The well seems to be dry, and you deice to take a glance at it's base.");
       System.out.println("It is filled with rotting corpses.");
       System.out.println("===================================================================================================");
       Continue();
       scans.nextLine();
       System.out.println("===================================================================================================");
       System.out.println("You think this is too organized for mere monsters.");
       System.out.println("You feel that you are being watched.");
       System.out.println("===================================================================================================");
       Continue();
       scans.nextLine();
       System.out.println("===================================================================================================");
       System.out.println("You are ambushed by a goblin and a Hobgoblin!.");
       System.out.println("The Hobgoblin commands the goblin to kill you.");
       System.out.println("Your clash with goblin began.");
       System.out.println("===================================================================================================");
       Continue();
       scans.nextLine();
    }
    public void stageIII(){
        System.out.println("===================================================================================================");
        System.out.println("You murdered the goblin mercilessly,");
        System.out.println("And the Hobgoblin runs cowardly.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("You start running off after him.");
        System.out.println("You chase after him unto the deep woods, and starts losing the monster.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("After searching for a while, The Hobgoblin had shown itself to you.");
        System.out.println("It seems different, more feral and powerful.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("It's eyes blood red with bloodlust, it decides to kill you.");
        System.out.println("Your eyes are filled with bloodlust as well, you are looking forward to the fight.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
     }

     public void stageIV(){
        System.out.println("===================================================================================================");
        System.out.println("In the bloody battle, you are the victor");
        System.out.println("And the Hobgoblin lies eternal on the earth.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("You decide to follow the Hobgoblin footsteps to see where he came from after you lose him before.");
        System.out.println("You Found an abandoned ruins, looking very much alike as the ancient crypt you seek.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("It seems to be guarded by a knight twice the size of the average men, and clad in armor as dark as night.");
        System.out.println("It has a mace so big it could crush a wyvern's head.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("You confront the knight.");
        System.out.println("'HALT, VERMIN!' Says the knight.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("BY ORDER OF MY LORD, ALL TRESSPASSERS SHALL BE CRUSHED!,");
        System.out.println("'PREPARE TO DIE VERMIN!' Says the knight.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
     }
     public void Ending(){
        System.out.println("===================================================================================================");
        System.out.println("You've bested the knight in single combat.");
        System.out.println("'FILTH, DO YOU KNOW ANY IDEA WHAT YOU'VE DONE?'.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("The knight fades away in ash, leaving a large black armor and mace as it's tomb.");
        System.out.println("You Finally head forward to the crypt.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("The crypt strangely entice you to come, it whisphers in your ears.");
        System.out.println("'RICHES YOU SHALL TAKE, POWERS YOU SHALL FIND' it whispher.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("'ALL CARNAL DESIRE CAN BE FOUND DEEP WITHIN THE HEART OF THIS PLACE' it whisphers.");
        System.out.println("You feel tempted, but you remembered the king orders was to investigate the source of the outbreak.");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("Now you feel you have two motivations to conquering this dungeon.");
        System.out.println("For the benefits of others, or for your own?");
        System.out.println("===================================================================================================");
        Continue();
        scans.nextLine();
        System.out.println("===================================================================================================");
        System.out.println("-----------------------------------=== PROLOGUE - END ===------------------------------------------");
        System.out.println("===================================================================================================");
     }
}
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}