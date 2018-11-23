package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BbanTest {

    @Test
    void shouldConstruct() {
	assertDoesNotThrow(() -> {
	    new Bban(0, 0, null, 0);
	});
    }

    @Test
    void shouldNotConstruct() {
	assertThrows(NullPointerException.class, () -> {
	    // new Bban(null);
	});
    }
}
