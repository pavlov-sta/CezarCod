package DeCoding;

import Alphabet.Alphabet;
import HandlingFile.FileHandling;

public class BruteForce implements Alphabet {


    public  String bruteForce(String message) {
        StringBuilder strBox = new StringBuilder(message.length());
        for (int k = 0; k < Alphabet.ALPHABET.length; k++) {
            strBox.append("\n\n Вариант " + (k + 1) + " \n\n");
            for (int i = 0; i < message.length(); i++) {
                for (int j = Alphabet.ALPHABET.length - 1; j > 0; j--) {
                    if (message.charAt(i) == Alphabet.ALPHABET[j]) {
                        if (0 > (j - k)) {
                            strBox.append(Alphabet.ALPHABET[Alphabet.ALPHABET.length + (j - k)]);
                        } else {
                            strBox.append(Alphabet.ALPHABET[j - k]);
                        }
                        break;
                    }
                }
            }
        }
        new FileHandling().writeFile(strBox.toString(),"BruteForce.txt");
        return strBox.toString();
    }
}
