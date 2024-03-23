package valorant;

import java.util.Scanner;

public class MatchDisplay {
    public static void main(String[]args){
        System.out.println("Map lists : ");
        Maplist disMap = new Maplist();
        //disMap.DisplayMaps();
        disMap.displayMapsGrid();

        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the number of matches you want to start:");
        int numberOfMatches = scanner.nextInt(); // Read user input

        MatchStart matchStarter = new MatchStart();
        for (int i = 0; i < numberOfMatches; i++) {
            String mapForMatch = matchStarter.startMatch(); // Start a match with a random map
            System.out.println("Match " + (i + 1) + " started on map: " + mapForMatch);
        }

        scanner.close(); // Close the scanner
    }
 }

