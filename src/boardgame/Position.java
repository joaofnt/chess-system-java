package boardgame;

public class Position {
    //encapsulamento atributos privados
    private int row;
    private int column;

    //construtor
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    //get e setters encapsulamento
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    //clase object e uma super classe de todas as classes
    //conceito também de sobreposição
    //sobrescrevendo o metodo toString da clase object
    @Override
    public String toString() {
        return row +  " , " + column;
    }
}
