package MorseKod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseKodÖversättareTestNya {

    MorseKodÖversättareNy morseKodÖversättare = new MorseKodÖversättareNy();

    @Test
    public void testTillMorseKod() {
        String input = "Hello world";
        String expectedOutput = "**** * *-** *-** ---  / *-- --- *-* *-** -**";
        assertEquals(expectedOutput, morseKodÖversättare.tillMorseKod(input));
    }

    @Test
    public void testTillEngelska() {
        String input = "**** * *-** *-** ---  / *-- --- *-* *-** -**";
        String expectedOutput = "HELLO WORLD";
        assertEquals(expectedOutput, morseKodÖversättare.tillEngelska(input));
    }

    @Test
    void testTillEngelskaMedSpecialtecken() {
        String morse = "*-*-*- --**-- **--**";
        String expected = ".,?";
        String actual = morseKodÖversättare.tillEngelska(morse);
        assertEquals(expected, actual);
    }
}
