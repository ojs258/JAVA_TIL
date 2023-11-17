package school.week11;

public class StringCompression {
    public static String compress(String s) {
        int count = 1;
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        compressed.append(s.charAt(s.length() - 1));
        compressed.append(count);

        if (compressed.length() >= s.length()) {
            return s;
        } else {
            return compressed.toString();
        }
    }

    public static void main(String[] args) {
        String s = "aabbccccccaa";
        String compressedString = compress(s);
        System.out.println(compressedString);
    }
}
