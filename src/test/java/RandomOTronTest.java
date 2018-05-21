import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class RandomOTronTest {

    RandomOTron randomOTron;
    ArrayList<String> names;
    ArrayList<String> randomNames;

    @Before
    public void before() {
        randomOTron = new RandomOTron();
        names = new ArrayList<String>();
        randomNames = new ArrayList<String>();
        names.add("Daniel");
        names.add("Oliver");
        names.add("Sophie");
        names.add("Sydney");
        names.add("Albert");
    }

    @Test
    public void checkListHasNames() {
        assertEquals(5, randomOTron.countNamesInList());
    }
    @Test
    public void checkRandomNamesHasNames(){
        Collections.shuffle(names);
        String name1 = this.names.get(0);
        String name2 = this.names.get(1);
        randomNames.add(name1);
        randomNames.add(name2);
        assertEquals(2, randomNames.size());
    }

}
