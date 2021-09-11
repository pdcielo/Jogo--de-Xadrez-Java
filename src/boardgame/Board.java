package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	public Board(int row, int colmuns) {
		this.rows = row;
		this.columns = colmuns;
		pieces = new Piece [rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
}
