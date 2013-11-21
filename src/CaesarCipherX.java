/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AS
 */
public class CaesarCipherX {

    private String cipherText;

    public CaesarCipherX() {
        cipherText = "";
    }

    public String CipherAllCharacter(int shift, String plainText) {
        int convertForm = 0;
        for (int i = 0; i < plainText.length(); i++) {
            convertForm = (plainText.charAt(i) + shift) % 128;
            if (convertForm < 0) {
                convertForm = convertForm + 128;
            }
            cipherText = cipherText + (char) (convertForm);
        }
        return cipherText;
    }

    public String CipherAlphabetOnly(int shift, String plainText) {
        int convertForm = 0;
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) >= 65 && plainText.charAt(i) <= 90) {
                convertForm = ((plainText.charAt(i) - 65) + shift) % 26;
                if (convertForm < 0) {
                    convertForm = convertForm + 26;
                }
                cipherText = cipherText + (char) (convertForm + 65);
            } else if (plainText.charAt(i) >= 97 && plainText.charAt(i) <= 122) {
                convertForm = ((plainText.charAt(i) - 97) + shift) % 26;
                if (convertForm < 0) {
                    convertForm = convertForm + 26;
                }
                cipherText = cipherText + (char) (convertForm + 97);
            } else {
                cipherText = cipherText + plainText.charAt(i);
            }
        }
        return cipherText;
    }
}
