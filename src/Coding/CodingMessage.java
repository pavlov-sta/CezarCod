package Coding;
import Alphabet.Alphabet;
import HandlingFile.FileHandling;


public class CodingMessage implements Alphabet {

    public String codingIncodMessage(String message, int key) {
        StringBuilder strBox = new StringBuilder(message.length());
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < Alphabet.ALPHABET.length; j++) {
                if (message.charAt(i) == Alphabet.ALPHABET[j]) {
                    strBox.append(Alphabet.ALPHABET[(j + key) % Alphabet.ALPHABET.length]);
                }
            }
        }
        new FileHandling().writeFile(strBox.toString(),"CodingMessage.txt");
        return strBox.toString();
    }
}
