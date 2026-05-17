package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverse_singleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverse_asciiString() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void reverse_null() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void reverse_unicode() {
        assertEquals("нйас", StringUtils.reverse("сайн"));
    }

    @Test
    void isBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void capitalize_simple() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }
}
