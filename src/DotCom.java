import java.util.ArrayList;

/**
 * Created by chuck on 2/3/14.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String s) {
        name = s;
    }

    public void setLocationCells(ArrayList<String> location) {
        this.locationCells = location;
    }

    public String checkYourself(String userInput) {

        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);


            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        return result;
    }
}
