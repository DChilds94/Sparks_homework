import java.util.ArrayList;
import java.util.Collections;

public class RandomOTron {
    ArrayList<String> names;
    ArrayList<String> randomNames;

    public RandomOTron() {
        this.names = new ArrayList<String>();
        this.randomNames = new ArrayList<String>();
        names.add("Daniel");
        names.add("Oliver");
        names.add("Sophie");
        names.add("Sydney");
        names.add("Albert");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public int countNamesInList(){
        return this.names.size();

    }

    public String shuffleNames(){
        Collections.shuffle(names);
        String result = this.names.get(0);
        return result;
    }

    public String shuffleTwoNames(){
        Collections.shuffle(names);
        String name1 = this.names.get(0);
        String name2 = this.names.get(1);
        this.randomNames.add(name1);
        this.randomNames.add(name2);
        return name1 + name2;

    }


}
