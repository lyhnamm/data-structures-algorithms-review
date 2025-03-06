package String;

public class CheckPangram {
    static final int MAX_CHAR = 26;

    // Naive Approach - By searching for each character
    public static boolean isPangram(String s) {
        // Iterate through all characters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;
            // Check every character
            for (int i = 0; i < s.length(); i++) {
                if (ch == Character.toLowerCase(s.charAt(i))) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }

    // Alternate Approach - By using visited array
    public static boolean checkPangram(String s) {
        boolean[] vst = new boolean[MAX_CHAR];
        // Loop over every character
        for (int i = 0; i < s.length(); i++) {
            // If uppercase letter
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                vst[s.charAt(i) - 'A'] = true;
            }
            // If lowercase letter
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                vst[s.charAt(i) - 'a'] = true;
            }
        }

        for (int i = 0; i < MAX_CHAR; i++) {
            if (!vst[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangram(s));
    }
}
