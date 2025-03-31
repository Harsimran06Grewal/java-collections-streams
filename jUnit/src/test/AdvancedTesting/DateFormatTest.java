package AdvancedTesting;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatTest {

    @Test
    void formatDate() throws ParseException {
        // Ensures that the formatDate method correctly converts "yyyy-MM-dd" to "dd-MM-yyyy".
        assertEquals("15-03-2025", DateFormat.formatDate("2025-03-15"));
    }

    @Test
    void testInvalidDateFormat(){
        // This date is in "dd-MM-yyyy" format instead of "yyyy-MM-dd"
        assertThrows(ParseException.class, ()-> DateFormat.formatDate("15-05-2025"));
    }
}