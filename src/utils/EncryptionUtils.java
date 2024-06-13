package utils;

public class EncryptionUtils {
    private static final int KEY = 3;

    public static int[][] encryptMessage(String message) {
        int[][] encrypted = new int[message.length()][2];
        for (int i = 0; i < message.length(); i++) {
            encrypted[i][0] = (int) message.charAt(i);
            encrypted[i][1] = (int) message.charAt(i) + KEY;
        }
        return encrypted;
    }

    public static String decryptMessage(int[][] message) {
        StringBuilder decrypted = new StringBuilder();
        for (int[] chars : message) {
            decrypted.append((char) (chars[1] - KEY));
        }
        return decrypted.toString();
    }
}
