package valorant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatchStart {
    private List<String> usedMaps = new ArrayList<>();
    private Maplist mapList = new Maplist();

    // Method to start a match with a random map
    public String startMatch() {
        List<String> availableMaps = new ArrayList<>(mapList.getMaps());
        availableMaps.removeAll(usedMaps);

        if (availableMaps.isEmpty()) {
            // If all maps have been used, reset the list of used maps
            usedMaps.clear();
            availableMaps = new ArrayList<>(mapList.getMaps());
        }

        // Select a random map from the available maps
        Random rand = new Random();
        String selectedMap = availableMaps.get(rand.nextInt(availableMaps.size()));
        // Add the selected map to the list of used maps
        usedMaps.add(selectedMap);
        return selectedMap;
    }
}