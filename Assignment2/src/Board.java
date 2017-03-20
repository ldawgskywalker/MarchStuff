
public class Board {
	private int rows;
	private int cols;
	
	//CONSTRUCTOR
	public Board(int r, int c){
		rows = r;
		cols = c;
	}
	//SET AND GETS
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}
	
}
