import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleSpaceFilterTest {

    @Test
    public void apply() {
        DoubleSpaceFilter filter = new DoubleSpaceFilter();
        String str = "Мама  мыла";
        assertTrue(filter.apply(str));
    }
}