package MorseKod;

import java.util.Scanner;

public class MainNya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Tryck 1 för engelska till morsekod");
            System.out.println("Tryck 2 för morsekod till engelska");

            int val = scanner.nextInt();
            scanner.nextLine();

            switch (val) {
                case 1:
                    System.out.println("Ange text som ska översättas till morsekod:");
                    String engelska = scanner.nextLine();
                    String morsekod = MorseKodÖversättareNy.tillMorseKod(engelska);
                    System.out.println("Morsekod: " + morsekod);
                    break;
                case 2:
                    System.out.println("Ange morsekod som ska översättas till text:");
                    String morseInput = scanner.nextLine();
                    String textOutput = MorseKodÖversättareNy.tillEngelska(morseInput);
                    System.out.println("Text: " + textOutput);
                    break;
                default:
                    System.out.println("Ogiltigt val.");
            }
        } catch (Exception e) {
            System.out.println("Ett oväntat fel uppstod: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
