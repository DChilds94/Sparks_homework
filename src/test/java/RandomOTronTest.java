import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RandomOTronTest {

    RandomOTron randomOTron;
    ArrayList<String> names;

    @Before
    public void before() {
        randomOTron = new RandomOTron();
        names = new ArrayList<String>();
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
}
