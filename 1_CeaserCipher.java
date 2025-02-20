class CaesarCipher {
    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static void main(String[] args) {
        String msg = "SIMATS University";
        System.out.println("Simulating Caesar Cipher\n------------------------");
        System.out.println("Input : " + msg);
        System.out.println("Encrypted Message : " + encode(msg, 3));
        System.out.println("Decrypted Message : " + decode(encode(msg, 3), 3));
    }
}
