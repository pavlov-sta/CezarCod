package Coding;

import Alphabet.Alphabet;
import HandlingFile.FileHandling;


public class CodingMessage {

    public String codingIncodMessage(String message, int key) {
        StringBuilder strBox = new StringBuilder(message.length());
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < Alphabet.getALPHABET().length; j++) {
                if (message.charAt(i) == Alphabet.getALPHABET()[j]) {
                    strBox.append(Alphabet.getALPHABET()[(j + key) % Alphabet.getALPHABET().length]);
                }
            }
        }
        new FileHandling().writeFile(strBox.toString(), "CodingMessage.txt");
        return strBox.toString();
    }
}
