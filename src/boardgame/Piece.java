package boardgame;

public class Piece {
    protected  Position position;
    private Board board;
    //assoiação da peça com tabuleiro

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //metodos protected somente classe dentro do mesmo pacote e sub classes herdadas podem acessar
    protected Board getBoard() {
        return board;
    }


}
