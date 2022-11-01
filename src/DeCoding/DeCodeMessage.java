package DeCoding;

import Alphabet.Alphabet;
import HandlingFile.FileHandling;

public class DeCodeMessage {

    public String getDeCodeMessage(String message, int key) {
        StringBuilder strBox = new StringBuilder(message.length());
        int tmp = key % Alphabet.getALPHABET().length;
        for (int i = 0; i < message.length(); i++) {
            for (int j = Alphabet.getALPHABET().length - 1; j > 0; j--) {
                if (message.charAt(i) == Alphabet.getALPHABET()[j]) {
                    if (0 > (j - tmp)) {
                        strBox.append(Alphabet.getALPHABET()[Alphabet.getALPHABET().length + (j - tmp)]);
                    } else {
                        strBox.append(Alphabet.getALPHABET()[j - tmp]);
                    }
                    break;
                }
            }
        }
        new FileHandling().writeFile(strBox.toString(), "DeCodeMessage.txt");
        return strBox.toString();
    }
}
