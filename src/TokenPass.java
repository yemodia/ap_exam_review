public class TokenPass {

    private int[] board;
    private int currentPlayer;



    public TokenPass(int [] cBoard, int cPlayer){
        this.board = cBoard;
        this.currentPlayer = cPlayer;
    }

    public int[] getBoard() {
        return board;
    }

    public void setBoard(int[] board) {
        this.board = board;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }



    public TokenPass(int playerCount) {
        currentPlayer = (int)(Math.random()*(playerCount-1)) + 1;
        board = new int[playerCount];
        for (int i = 0; i < playerCount; i++){
            board[i] = (int)((Math.random()*10) + 1);
        }

    }

    /** Distributes the tokens from the current player's position one at a time to each player in
     * the game. Distribution begins with the next position and continues until all the tokens
     * have been distributed. If there are still tokens to distribute when the player at the
     * highest position is reached, the next token will be distributed to the player at position 0.
     * Precondition: the current player has at least one token.
     * Postcondition: the current player has not changed.
     */
    public void distributeCurrentPlayerTokens() {
        int Token = board[currentPlayer];
        board[currentPlayer]= 0;
        int placeHolder = currentPlayer + 1;
        while (Token != 0){
            if (placeHolder >= board.length){
                placeHolder = 0;
            }
            Token--;
            board[placeHolder]++;
            placeHolder++;
        }

    }


}
