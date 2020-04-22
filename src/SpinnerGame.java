public class SpinnerGame {
    /**
     * Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max) {
        int result = (int) (Math.random() * max) + min;

        return result;
    }

    /**
     * Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int playerSpin1 = spin(1, 10);
        int computerSpin1 = spin(2, 8);
        if (playerSpin1 > computerSpin1)
            System.out.println("You win! " + (playerSpin1 - computerSpin1) + " points");

        else if (computerSpin1 > playerSpin1)
            System.out.println("You lose. " + (playerSpin1 - computerSpin1) + " points");

        else {
            int playerSpin2 = spin(1, 10);
            int computerSpin2 = spin(2, 8);
            if (playerSpin2 + playerSpin1 < computerSpin2 + computerSpin1)
                System.out.println("You lose. -1 point");
            else if (playerSpin2 + playerSpin1 > computerSpin2 + computerSpin1)
                System.out.println("You win! 1 point");
            else
                System.out.println("Tie. 0 points");
        }
    }
}
