public class Exercise4 {
    public static void main(String[] args) {
        // Rappresenta la griglia del gioco di tris come un array e seleziona l'elemento in basso a destra
        char[][] trisBoard = {
                {'O', 'X', 'X'},
                {'X', 'O', 'O'},
                {'X', 'O', 'O'}
        };

        System.out.println(trisBoard.length);
        System.out.println(trisBoard[2]);
        System.out.println(trisBoard[2][2]);
    }
}
