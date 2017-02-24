
public class TicTacToeBoard extends Board {
	
	private XO board[][];
	private int turnCnt;
	
	
	public TicTacToeBoard(int r, int c) {
		super(r, c);
		turnCnt = 0;
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


	public void setTurnCnt() {
		turnCnt = XO.getTurn();
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
