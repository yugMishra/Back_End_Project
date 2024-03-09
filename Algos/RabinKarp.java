package dataStructures;

public class RabinKarp {
    private static final int PRIME = 101; // A prime number used for hashing

    public static void search(String text, String pattern) {
        int patternHash = hash(pattern, pattern.length());
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            String substring = text.substring(i, i + pattern.length());
            int substringHash = hash(substring, pattern.length());
            if (patternHash == substringHash && substring.equals(pattern)) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    private static int hash(String str, int length) {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    public static void main(String[] args) {
        String text = "ABABCABABCDABABCABAB";
        String pattern = "ABAB";
        search(text, pattern);
    }
}

