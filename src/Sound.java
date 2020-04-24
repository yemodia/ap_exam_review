public class Sound {

    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    /** constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {

        this.samples = samples;
    }

    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are chhanged to -limit.
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {

        int numChanged = 0;

        for (int x = 0; x < this.samples.length; x++) {
            if (samples[x] > limit) {
                samples[x] = limit;
                numChanged++;
            } else if (samples[x] < limit * -1) {
                samples[x] = limit * -1;
                numChanged++;
            }
        }
        return numChanged;

    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0;
     * Precodition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        int zeros = -1;
        for (int x = 0; x < samples.length; x++){
            if (samples[x] == 0)
                zeros = x + 1;
            else
                break;
        }
        int[] list;
        if (zeros != -1)
            list = new int[samples.length - zeros];
        else
            return;
        for (int x = 0; x < list.length; x++)
            list[x] = samples[zeros + x];
        samples = list;

       
    }

    /** accessor method used for testing purposes - Not part of original program */
    public int[] getSamples() {
        return samples;
    }
}
