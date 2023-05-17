package SandyYudhaAlvyan;

public class Soal_B {
    public static void main(String[] args) {
        // Contoh penggunaan
        String text1 = "palindrom";
        String pattern1 = "ind";
        int count1 = pattern_count(text1, pattern1);
        System.out.println("Output 1: " + count1); // Output: 1

        String text2 = "abakadabra";
        String pattern2 = "ab";
        int count2 = pattern_count(text2, pattern2);
        System.out.println("Output 2: " + count2); // Output: 2

        String text3 = "hello";
        String pattern3 = "";
        int count3 = pattern_count(text3, pattern3);
        System.out.println("Output 3: " + count3); // Output: 0

        String text4 = "ababab";
        String pattern4 = "aba";
        int count4 = pattern_count(text4, pattern4);
        System.out.println("Output 4: " + count4); // Output: 2

        String text5 = "aaaaaa";
        String pattern5 = "aa";
        int count5 = pattern_count(text5, pattern5);
        System.out.println("Output 5: " + count5); // Output: 5

        String text6 = "hell";
        String pattern6 = "hello";
        int count6 = pattern_count(text6, pattern6);
        System.out.println("Output 6: " + count6); // Output: 0
    }

    public static int pattern_count(String text, String pattern) {
        if (pattern.equals("")) {
            return 0;
        }

        int count = 0;
        int textLength = text.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            boolean match = true;

            for (int j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }
}

