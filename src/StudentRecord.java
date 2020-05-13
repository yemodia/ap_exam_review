public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /** Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        /* to be implemented in part (a) */

        double stuAverage = 0;
        int count = 0;

        for( int i = first; i <= last; i++){
            stuAverage += scores[i];
            count++;
        }
        stuAverage /= count;

        return stuAverage;

    }

    /** Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        /* to be implemented in part (b) */

        int mark = scores[0];
        for(int i= 0; i < scores.length; i++){
            if (mark > scores[i+1])
                return false;
            else if (mark <= scores[i+1]);
            mark = scores[i+1];

        }
        return true;

    }

    /** If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        /* to be implemented in part (c) */
        if (hasImproved()){
            return average(scores.length/2, scores.length-1);

        }
        return average(0, scores.length-1);

    }
}
