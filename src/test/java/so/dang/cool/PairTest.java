package so.dang.cool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PairTest {
    @Test
    public void to_string() {
        Pair<String, String> pair = Pair.of("apple", "banana");

        assertEquals(pair.toString(), "[apple, banana]");
    }

    @Test
    public void hashcode_equals_self() {
        Pair<String, String> pair = Pair.of("c++", "java");

        assertEquals(pair.hashCode(), pair.hashCode());
    }

    @Test
    public void hashcode_equals_equivalent() {
        Pair<String, String> pair1 = Pair.of("python", "ruby");
        Pair<String, String> pair2 = Pair.of("python", "ruby");

        assertEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    public void hashcode_not_equals_different_left() {
        Pair<String, String> pair1 = Pair.of("minnie", "mouse");
        Pair<String, String> pair2 = Pair.of("mini", "mouse");

        assertNotEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    public void hashcode_not_equals_different_right() {
        Pair<String, String> pair1 = Pair.of("daisy", "duck");
        Pair<String, String> pair2 = Pair.of("daisy", "duke");

        assertNotEquals(pair1.hashCode(), pair2.hashCode());
    }
    @Test
    public void equals_self() {
        Pair<String, String> pair = Pair.of("michael", "mouse");

        assertTrue(pair.equals(pair));
    }

    @Test
    public void equals_equivalent() {
        Pair<Integer, String> pair1 = Pair.of(101, "dalmatians");
        Pair<Integer, String> pair2 = Pair.of(101, "dalmatians");

        assertTrue(pair1.equals(pair2));
        assertTrue(pair2.equals(pair1));
    }

    @Test
    public void not_equals_null() {
        Pair<String, String> pair = Pair.of("darkwing", "duck");

        assertFalse(pair.equals(null));
    }

    @Test
    public void not_equals_different_left() {
        Pair<String, String> pair1 = Pair.of("mickey", "mouse");
        Pair<String, String> pair2 = Pair.of("michael", "mouse");

        assertFalse(pair1.equals(pair2));
        assertFalse(pair2.equals(pair1));
    }

    @Test
    public void not_equals_different_right() {
        Pair<String, String> pair1 = Pair.of("donald", "duck");
        Pair<String, String> pair2 = Pair.of("donald", "dog");

        assertFalse(pair1.equals(pair2));
        assertFalse(pair2.equals(pair1));
    }
}
