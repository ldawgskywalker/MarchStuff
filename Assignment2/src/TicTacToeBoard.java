
public class TicTacToeBoard extends Board {
	
	private XO board[][];
	private int turnCnt;
	
	//CONSTRUCTOR
	public TicTacToeBoard(int r, int c) {
		//CALLS SUPERCLASS CONSTRUCTOR
		super(r, c);
		turnCnt = 0;
		board = new XO[r][c];
		
		//SETS ENTIRE 2D ARRAY TO "BLANK" xo OBJECT
		XO x = new XO();
		x.setName("");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				board[i][j] = x;
			}
		}
		
	}

	//GET AND SETS
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
		turnCnt++;
	}
	
	//CHECKS IF SPACE IS OPEN
	public boolean add(int x, int y){
		if(board[x][y].getName().equals(""))
			return true;
		else
			return false;
	}
	
	//SETS SPECIFIC SPOT TO AN xo OBJECT
	public void add(int x, int y, XO n){
		board[x][y] = n;
	}

	//CHECKS IF THERE IS WINNER
	public boolean winner(){
		//TOP
		if(board[0][0].equals(board[0][1])&& board[0][0].equals(board[0][2]) && !board[0][0].getName().equals("")){
			return true;
		}
		//HORIZONTAL MIDDLE
		if(board[1][0].equals(board[1][1])&& board[1][0].equals(board[1][2])&& !board[1][0].getName().equals("")){
			return true;
		}
		//DIAG FROM TOP LEFT
		if(board[0][0].equals(board[1][1])&&board[0][0].equals(board[2][2])&& !board[0][0].getName().equals("")){
			return true;
		}
		//VERTICAL MIDDLE
		if(board[0][1].equals(board[1][1])&&board[0][1].equals(board[2][1])&& !board[0][1].getName().equals("")){
			return true;
		}
		//DIAG FROM TOP RIGHT
		if(board[0][2].equals(board[1][1])&&board[0][2].equals(board[2][0])&& !board[0][2].getName().equals("")){
			return true;
		}
		//BOTTOM
		if(board[2][0].equals(board[2][1])&&board[2][0].equals(board[2][2])&& !board[2][0].getName().equals("")){
			return true;
		}
		//LEFT
		if(board[0][0].equals(board[1][0])&&board[0][0].equals(board[2][0])&& !board[0][0].getName().equals("")){
			return true;
		}
		//RIGHT
		if(board[0][2].equals(board[1][2])&&board[0][2].equals(board[2][2])&& !board[0][2].getName().equals("")){
			return true;
		}
		
		return false;
	}
	//PRINTS 2D ARRAY
	public String toString(){
		return "\t\tCol"
				+"\n\t\t1\t2\t3"
				+"\nRow\t1\t"+board[0][0]+"\t"+board[0][1]+"\t"+board[0][2]
				+"\n\t2\t"+board[1][0]+"\t"+board[1][1]+"\t"+board[2][2]
				+"\n\t3\t"+board[2][0]+"\t"+board[2][1]+"\t"+board[2][2];
	}
	
	
}
