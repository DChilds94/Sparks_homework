import java.util.ArrayList;

public class RandomOTron {
    ArrayList<String> name;

    public RandomOTron() {
        this.name = new ArrayList<String>();
        name.add("Daniel");
        name.add("Oliver");
        name.add("Sophie");
        name.add("Sydney");
        name.add("Albert");
    }

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public int countNamesInList(){
        return this.name.size();
    }


}
