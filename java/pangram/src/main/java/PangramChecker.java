public class PangramChecker {
    public static boolean isPangram(String words) {
        /* isPangram checks if all letters of the alphabet are present */
        words = words.toLowerCase();
        for(char a = 'a'; a <= 'z'; a++) {
          // to prevent a negative number
            if (words.indexOf(a) < 0) {
                return false;
            }
        }
        return true;
    }
}
