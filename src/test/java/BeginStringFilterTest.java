import org.junit.Test;

import static org.junit.Assert.*;

public class BeginStringFilterTest {
    @Test
    public void test(){
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        assertTrue(filter1.apply(str));
        assertFalse(filter2.apply(str));
    }

}