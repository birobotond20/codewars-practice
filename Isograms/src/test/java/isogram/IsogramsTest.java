package isogram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class IsogramsTest {

    @Test
    public void testIsograms() {
        assertEquals(true, Isograms.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isograms.isIsogram("isogram"));
        assertEquals(false, Isograms.isIsogram("moose"));
        assertEquals(false, Isograms.isIsogram("isIsogram"));
        assertEquals(false, Isograms.isIsogram("aba"));
        assertEquals(false, Isograms.isIsogram("moOse"));
        assertEquals(true, Isograms.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isograms.isIsogram(""));
    }
}
