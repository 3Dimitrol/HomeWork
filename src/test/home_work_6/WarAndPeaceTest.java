import home_work_6.WarAndPeace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class WarAndPeaceTest {

    @Test
    public void testWord(){
        WarAndPeace word = new WarAndPeace();
        File buch = new File("WarAndPeace.txt");

        Assertions.assertEquals(40312, word.file(buch));
    }

    }

