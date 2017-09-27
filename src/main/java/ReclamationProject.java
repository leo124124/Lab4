/*
 * The following code needs a lot of TLC. So give it some! 1. Fix all checkstyle errors 2. Determine
 * what it does (it's going to be tough before you finish #1) 3. Improve the name of the methods and
 * variables 4. Add comments and Javadoc comments where needed 5. Remove unnecessary comments as
 * appropriate
 */

/**
 * A class that searches for a string in text.
 */

public class ReclamationProject {

    /**
     * @param a asdasd
     * @param b asdasd
     * @return whether the word is a strict palindrome or not
     */

    static String doit(final String a, final String b) {

        String newA = a;
        String newB = b;

        if (a.length() > b.length()) {
            newB = a;
            newA = b;
        }
        String r = ""; // I love the ternary operator!
        /*
         * For loop with i
         */
        for (int i = 0; i < newA.length(); i++) {
            for (int j = newA.length() - i; j > 0; j--) {
                for (int k = 0; k < newB.length() - j; k++) {
                    if ((newA.regionMatches(i, b, k, j) && j > r.length())) {
                        r = newA.substring(i, i + j);
                    }
                }
            } // Ah yeah
        }
        return r;
    }
}
