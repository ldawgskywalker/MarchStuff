
public class TicTacToeBoard extends Board {
	
	private XO board[][];
	private int turnCnt;
	
	
	public TicTacToeBoard(int r, int c) {
		super(r, c);
	}


	public XO[][] getBoard() {
		return board;
	}


	public void setBoard(XO[][] board) {
		this.board = board;
	}


	public int getTurnCnt() {
		return turnCnt;
	}


	public void setTurnCnt(int turnCnt) {
		this.turnCnt = turnCnt;
	}
	
	public boolean add(int x, int y){
		return true;
	}
	
	public boolean winner(){
		return true;
	}
	
	public String toString(){
		return "";
	}
	
	
}
