package DeCoding;

import Alphabet.Alphabet;
import HandlingFile.FileHandling;

public class BruteForce {

    public String bruteForce(String message) {
        StringBuilder strBox = new StringBuilder(message.length());
        for (int k = 0; k < Alphabet.getALPHABET().length; k++) {
            strBox.append("\n\n Вариант " + (k + 1) + " \n\n");
            for (int i = 0; i < message.length(); i++) {
                for (int j = Alphabet.getALPHABET().length - 1; j > 0; j--) {
                    if (message.charAt(i) == Alphabet.getALPHABET()[j]) {
                        if (0 > (j - k)) {
                            strBox.append(Alphabet.getALPHABET()[Alphabet.getALPHABET().length + (j - k)]);
                        } else {
                            strBox.append(Alphabet.getALPHABET()[j - k]);
                        }
                        break;
                    }
                }
            }
        }
        new FileHandling().writeFile(strBox.toString(), "BruteForce.txt");
        return strBox.toString();
    }
}
