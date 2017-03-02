public class CheckerBoard {
	public static void main(String[] args){
		int board[][] = new int[8][8];
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
					board[i][j] = (Math.random()>0.5)? 1:0;
			}
		}
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
