package DeCoding;

import Alphabet.Alphabet;
import HandlingFile.FileHandling;

public class DeCodeMessage implements Alphabet {

    public String getDeCodeMessage(String message, int key) {
        StringBuilder strBox = new StringBuilder(message.length());
        int tmp = key % Alphabet.ALPHABET.length;
        for (int i = 0; i < message.length(); i++) {
            for (int j = Alphabet.ALPHABET.length - 1; j > 0; j--) {
                if (message.charAt(i) == Alphabet.ALPHABET[j]) {
                    if (0 > (j - tmp)) {
                        strBox.append(Alphabet.ALPHABET[Alphabet.ALPHABET.length + (j - tmp)]);
                    } else {
                        strBox.append(Alphabet.ALPHABET[j - tmp]);
                    }
                    break;
                }
            }
        }
        new FileHandling().writeFile(strBox.toString(),"DeCodeMessage.txt");
        return strBox.toString();
    }
}
