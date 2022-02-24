import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordsFilterTest {
    @Test
            public void test() {
        String str1 = "Корабли лавировали, лавировали, лавировали, да не вылавировали";
        String str2 = "Корабли трижды лавировали, но попытки были тщетны";
        RepeatedWordsFilter filter = new RepeatedWordsFilter();
        assertTrue(filter.apply(str1));
        assertFalse(filter.apply(str2));
    }


}