package valorant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maplist{
private String[] maps = {"Sunset","Lotus","Pearl","Fracture","Breeze","Icebox","Bind","Bind","Split","Ascent"};

    // Method to get the list of maps
    public List<String> getMaps() {
        List<String> mapsList = new ArrayList<>();
        Collections.addAll(mapsList, maps);
        return mapsList;
    }


    public void DisplayMaps(){
    for (String map : maps){
        System.out.println(map);
     }
    }
    public void displayMapsGrid() {
        int columns = 2; // Set the number of columns
        int rows = (int) Math.ceil((double) maps.length / columns); // Calculate the number of rows needed

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int index = i + j * rows; // Calculate the index of the map to display
                if (index < maps.length) {
                    System.out.printf("%-15s", maps[index]); // Print map name with formatting
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
    
}
