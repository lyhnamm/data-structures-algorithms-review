package String;

public class EasyProblems {
    // Check string is Binary
    public static boolean isBinary(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    // Camel case
    public static String camelCaseConverter(String s) {
        int n = s.length();
        boolean capitalizeNext = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            if (s.charAt(i) == ' ') {
                capitalizeNext = true;
                continue;
            }
            if (capitalizeNext) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                capitalizeNext = false;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    // Count substring begin and end with 1's - Nested loop
    public static int countSubString1s(String s) {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == '1') {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    // Count substring begin and end with 1's - Subarray count
    public static int countSubString(String s) {
        int n = s.length();
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                m++;
            }
        }
        return m * (m - 1) / 2;
    }

    // Count substring begin and end with 1's - Recursion
    static int count1s(char[] str, int i) {
        int n = str.length;
        // if end index
        if (i == n - 1) {
            return str[i] == '1' ? 1 : 0;
        }
        if (str[i] == '1') {
            return 1 + count1s(str, i + 1);
        } else {
            return count1s(str, i + 1);
        }
    }

    public static int countSubString(char[] str) {
        int m = count1s(str, 0);
        return m * (m-1)/2;
    }

    public static void main(String[] args) {
        String s = "01001000101";
        char[] str = s.toCharArray();
        System.out.println(countSubString(str));
    }
}
