public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */

        int number = n;
        int track = 0;

        while (true){

            if(number == 1){
                track++;
                break;

            }
            else if (number % 1 ==0){
                number = (number *3 ) +1;
                track++;
            }
            else if(number % 2 == 0){
                number = number /2;
                track++;
            }
        }
        return track;


    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        int found = hailstoneLength(n);
        if (found > n){
            return true;
        }
        else
            return false;

    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */

        int finalTrue = 0;
        for (int x = 1; x < n; x++ ){
            if(isLongSeq(x))
                finalTrue++;
        }
        return ((double)finalTrue/n);
    }

    // There may be instance variables, constructors, and methods not shown.
}
