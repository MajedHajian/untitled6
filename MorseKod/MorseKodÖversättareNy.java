package MorseKod;

import java.util.HashMap;
import java.util.Map;

public class MorseKodÖversättareNy {
    private static final Map<Character, String> engelskaTillMorse = new HashMap<>();
    private static final Map<String, Character> morseTillEngelska = new HashMap<>();

    static {

        engelskaTillMorse.put('A', "*-");
        engelskaTillMorse.put('B', "-***");
        engelskaTillMorse.put('C', "-*-*");
        engelskaTillMorse.put('D', "-**");
        engelskaTillMorse.put('E', "*");
        engelskaTillMorse.put('F', "**-*");
        engelskaTillMorse.put('G', "--*");
        engelskaTillMorse.put('H', "****");
        engelskaTillMorse.put('I', "**");
        engelskaTillMorse.put('J', "*---");
        engelskaTillMorse.put('K', "-*-");
        engelskaTillMorse.put('L', "*-**");
        engelskaTillMorse.put('M', "--");
        engelskaTillMorse.put('N', "-*");
        engelskaTillMorse.put('O', "---");
        engelskaTillMorse.put('P', "*--*");
        engelskaTillMorse.put('Q', "--*-");
        engelskaTillMorse.put('R', "*-*");
        engelskaTillMorse.put('S', "***");
        engelskaTillMorse.put('T', "-");
        engelskaTillMorse.put('U', "**-");
        engelskaTillMorse.put('V', "***-");
        engelskaTillMorse.put('W', "*--");
        engelskaTillMorse.put('X', "-**-");
        engelskaTillMorse.put('Y', "-*--");
        engelskaTillMorse.put('Z', "--**");
        engelskaTillMorse.put('0', "-----");
        engelskaTillMorse.put('1', "*----");
        engelskaTillMorse.put('2', "**---");
        engelskaTillMorse.put('3', "***--");
        engelskaTillMorse.put('4', "****-");
        engelskaTillMorse.put('5', "*****");
        engelskaTillMorse.put('6', "-****");
        engelskaTillMorse.put('7', "--***");
        engelskaTillMorse.put('8', "---**");
        engelskaTillMorse.put('9', "----*");
        engelskaTillMorse.put('.', "*-*-*-");
        engelskaTillMorse.put(',', "--**--");
        engelskaTillMorse.put('?', "**--**");
        engelskaTillMorse.put('!', "-*-*--");
        engelskaTillMorse.put(' ', "/");


        for (Map.Entry<Character, String> entry : engelskaTillMorse.entrySet()) {
            morseTillEngelska.put(entry.getValue(), entry.getKey());
        }
    }

    public static String tillMorseKod(String text) {
        StringBuilder morseKod = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (c == ' ') {
                morseKod.append(" / ");
            } else if (engelskaTillMorse.containsKey(c)) {
                morseKod.append(engelskaTillMorse.get(c)).append(" ");
            }
        }
        return morseKod.toString().trim();
    }

    public static String tillEngelska(String morse) {
        StringBuilder text = new StringBuilder();
        String[] morseWords = morse.split("\\s+/\\s*");

        for (String morseWord : morseWords) {
            String[] morseChars = morseWord.split("\\s+");
            for (String morseChar : morseChars) {
                if (morseTillEngelska.containsKey(morseChar)) {
                    text.append(morseTillEngelska.get(morseChar));
                } else {
                    text.append("?");
                }
            }
            text.append(' ');
        }
        return text.toString().trim();
    }
}
